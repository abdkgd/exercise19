package org.fujitsu.training.codes;

public class SavingsAccount {
	
	private float interestRate;
	private double initialBalance;
	private double interest;

	public SavingsAccount() {
		
		this.interestRate = 0F;
		this.initialBalance = 0;
	}
	
	public SavingsAccount(float interestRate, double initialBalance) {
		
		this.interestRate = interestRate;
		this.initialBalance = initialBalance;
	}
	
	public double deposit(double initialBalance) {
		
		this.interest += initialBalance;
		return this.initialBalance;
	}
	
	public double withdraw(double initialBalance) {
		
		this.initialBalance -= initialBalance;
		return this.initialBalance;
	}
	
	public double addInterest(double interest) {
		
		double amountOfInterest = this.initialBalance * (interest / 12);
		this.interest += amountOfInterest;
		return this.interest;
	}
	
	public float getInterestRate() {
		return interestRate;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	
	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	
}
