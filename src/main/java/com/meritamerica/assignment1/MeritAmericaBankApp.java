package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
public static void main(String[]args) {
	
	AccountHolder	ac= new AccountHolder("John","James","Doe","123-45-6789",100,1000);
	System.out.println(ac.toString());
	ac.chk1.deposit(500);
	ac.sav1.withdraw(800);
	System.out.println(ac.chk1.toString());
	System.out.println(ac.sav1.toString());
	
	AccountHolder	ac2= new AccountHolder("","","","",200,500);
	ac2.chk1.deposit(-500);
	ac2.sav1.withdraw(600);
	System.out.println(ac2.toString());

	}
}
