package com.meritamerica.assignment1;

public class AccountHolder {
	private String fN; 
	private String mN;
	private String lN;
	private String ssnNumber;
	private double c;
	private double s;
	static double Rate= 0.0001;
	CheckingAccount chk1;
	SavingsAccount sav1;
		AccountHolder(){	
		}
		AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance){
			this.fN = firstName;
			this.mN=middleName;
			this.lN=lastName;
			this.ssnNumber=ssn;
			this.c = checkingAccountOpeningBalance;
			this.s = savingsAccountOpeningBalance;
			chk1 = new CheckingAccount(c);
			sav1 = new SavingsAccount(s);
		}
		
		public String getFirstName(){
			return fN;
		}
		void setFirstName(String firstName) {
			this.fN=firstName;
		}
		public String getmiddleName(){
			return mN;
		}
		
		void setMiddleName(String middleName) {
			this.mN=middleName;
		}
		
		public String getLastName(){
			return lN;
		}
		void setLastName(String lastName) {
		this.lN=lastName;
		}
		public String getSSN(){
		return ssnNumber;
		
		}
		void setSSN(String SSN) {
		this.ssnNumber=SSN;
		}
		
		public CheckingAccount getCheckingAccount() {
			return chk1;
		}
		public SavingsAccount getSavingsAccount() {
			return sav1;
		}
		@Override
		public String toString() {
			return "AccountHolder [fN=" + fN + ", mN=" + mN + ", lN=" + lN + ", ssnNumber=" + ssnNumber + ", c=" + c
					+ ", s=" + s + "]";
		}
		
}