package org.fujitsu.training.objects;

import org.fujitsu.training.objects.exception.PayFirstForAdditionalException;

public class LeCreamDeApp {

	private LeCream lecream;
	
	public LeCreamDeApp(IceCreamFlavors flavor, int numberOfScoops, boolean withWafer) {
		lecream = new LeCream(flavor, numberOfScoops, withWafer);
	}
	
	public void run() {
		
		lecream.selectFlavor();
		lecream.addWafer();
		
		try {
			lecream.determineNumberOfScoopes();
		} catch (PayFirstForAdditionalException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(lecream.isPayable())
			System.out.println(lecream.getAmountPayable());
	}
	
	public void setLecream(LeCream lecream) {
		this.lecream = lecream;
	}
	
}
