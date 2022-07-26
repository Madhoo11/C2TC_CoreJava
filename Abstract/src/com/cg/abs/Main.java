package com.cg.abs;


abstract class Bike {
	abstract void run();
	abstract void getBikedetail();
	
}

class Honda extends Bike{  ////single inheritance.achieving inheritanve by extending bike class
	

	@Override
	void run() {
		System.out.println(" THE BIKE IS RUNNING SAFELY");
		
		
	}

@Override
void getBikedetail() {
	// TODO Auto-generated method stub
	
}           
	
}

public class Main {                         // object creation
	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
		h.getBikedetail();
		// TODO Auto-generated method stub
       System.out.println("the model of the bike is rx100");
	}

}
