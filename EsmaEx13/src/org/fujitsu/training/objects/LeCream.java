package org.fujitsu.training.objects;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.fujitsu.training.objects.exception.PayFirstForAdditionalException;

public class LeCream implements LeCreamFeatures{

	private double amountPayable;
	private boolean isChocolate;
	private boolean payable = true;
	private IceCreamFlavors flavor;
	private int numberOfScoops;
	private boolean withWafer;
	private DecimalFormat df;
	
	public LeCream(IceCreamFlavors flavor, int numberOfScoops, boolean withWafer) {
		this.flavor = flavor;
		this.numberOfScoops = numberOfScoops;
		this.withWafer = withWafer;
		
		df = new DecimalFormat();
		df.applyPattern("$##0.00");
		df.setRoundingMode(RoundingMode.UP);
	}
	
	public boolean isPayable() {
		return payable;
	}

	public String getAmountPayable() {
		return df.format(amountPayable);
	}

	@Override
	public boolean selectFlavor() {
		if(this.flavor == IceCreamFlavors.CHOCOLATE)
			this.isChocolate = true;
		else 
			this.isChocolate = false;
		return false;
	}

	@Override
	public int determineNumberOfScoopes() throws PayFirstForAdditionalException, Exception{
		if(this.numberOfScoops == 2) {
			if(isChocolate) 
				this.amountPayable += ChocolateFlavor.TWO_SCOOPS;
			else 
				this.amountPayable += OtherFlavor.TWO_SCOOPS;
		}
		else if(this.numberOfScoops == 3) {
			if(isChocolate) 
				this.amountPayable += ChocolateFlavor.THREE_SCOOPS;
			else
				this.amountPayable += OtherFlavor.THREE_SCOOPS;
		}
		else {
			payable = false;
			throw new PayFirstForAdditionalException();
		}
		return 0;
	}

	@Override
	public boolean addWafer() {
		if(this.withWafer)
			this.amountPayable += 10;
		else
			this.amountPayable += 0;
		return false;
	}

}
