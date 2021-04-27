package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double Balance;
	private static double Rate = 0.0001;
	private double Amount;
	Double years;
	
	CheckingAccount(){
		//this.Balance=100;
		//this.years = 3.00;
	}
	 
	CheckingAccount(double openingBalance){
		this.Balance= openingBalance;
		System.out.println(Balance);
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
		return "CheckingAccount [Balance=" + Balance + ", Amount=" + Amount + ", years=" + years + "]";
	}
	 

}