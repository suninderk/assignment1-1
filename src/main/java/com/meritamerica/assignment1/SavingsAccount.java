package com.meritamerica.assignment1;

public class SavingsAccount {

	private double Balance;
	private static double Rate = 0.01;
	private double Amount;
	Double years;
	
	SavingsAccount(){
		this.Balance=100;
		this.years = 3.00;
	}
	 
	SavingsAccount(double openingBalance){
		this.Balance= openingBalance;	
	}
	
	public double getBalance() {
		return Balance;	
	}
	
	public double getInterestRate() {
		return Rate;	
	}
	
	boolean withdraw (double amount) {
		if (amount < 0) return false;
		double b = Balance - amount;
		if (b<0) {
			return false;
		}else {
			Balance = Balance - amount;
			return true;
		}
	}
	boolean deposit (double amount) {
		 if (amount > 0 ) {
			 Balance = Balance + amount;
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 double futureValue(int n) {
		 years = new Double(n);
		 return Balance*(Math.pow((1+Rate), years));
	 }

	@Override
	public String toString() {
		return "SavingsAccount [Balance=" + Balance + ", Amount=" + Amount + ", years=" + years + "]";
	}

}