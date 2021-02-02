package org.fujitsu.training.codes;

public class Rooms {

	private float rate;
	private Dimensions dimension;
	private int numberOfPersons;

	public Rooms() {
		this.dimension = new Dimensions();
		this.dimension.setLength(10F);
		this.dimension.setWidth(20F);
	}

	public float getRate() {
		return rate;
	}

	public Dimensions getDimension() {
		return dimension;
	}

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public void setDimension(Dimensions dimension) {
		this.dimension = dimension;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	
	@Override
	public String toString() {
		return String.join(" ", "Rooms:",
							getNumberOfPersons()+"", getRate()+"",
							getDimension().getLength()+"",
							getDimension().getLength()+"");
	}
}
