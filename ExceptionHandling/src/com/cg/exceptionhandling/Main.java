package com.cg.exceptionhandling;

public class Main {

	public static void main(String[] args) {
		
		try{
			String name = null;
			System.out.println(name.length());//output = parent exception
			//int a[]= new int[5];
			//System.out.println(a[7]);
			//a[5]=50/0;
		}
		finally {
			System.out.println("rest of the code");
			System.out.println("there is no catch block used");
		}

		//catch(ArithmeticException  e) {
			//System.out.println("ARITHMETIC EXP OCCURS");
		//}
		//catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("ARRAYINDEXOUTOF BOUND EXP OCCURS");
		//}
		//catch(Exception e) {
			//System.out.println("PARENT EXCEPTION");
		//}
		
		//System.out.println("rest of the code");
	
}

}
//child class exception first
//parent class handlers