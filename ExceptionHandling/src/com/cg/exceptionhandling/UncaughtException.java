package com.cg.exceptionhandling;

public class UncaughtException {

	public static void main(String[] args) {
		try{
			for(int i=5;i>=0;i--) {
				System.out.println(10/i);
		}
		
		
		
	}
		catch(Exception e) {
			System.out.println("Exception message:" + e.getMessage());
			e.printStackTrace(); //gives information about the error
		}
	System.out.println("after the loop....");

}
}
