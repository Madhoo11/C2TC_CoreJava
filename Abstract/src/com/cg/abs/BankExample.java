package com.cg.abs;
abstract class Bank{
	abstract int rateOfInterest();
}
 class SBI extends Bank{
	 int rateOfInterest() {
		 return 7;
	 }
 }
 class HDFC extends Bank{
	 int rateOfInterest() {
		 return 8;
 
	}
 }
	 
 

public class BankExample {

	public static void main(String[] args) {
		SBI s = new SBI();
		HDFC h= new HDFC();
		h.rateOfInterest();
		System.out.println("THE RATE OF INTEREST IN SBI"+ s.rateOfInterest());
		System.out.println("THE RATE OF INTEREST IN HDFC"+ h.rateOfInterest());
		
	}

}
