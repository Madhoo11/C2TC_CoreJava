package com.cg.abs;
abstract class Bike{
	abstract void run();
	abstract void getBikedetail();
    
}

class Yamaha extends Bike{

	@Override
	void run() {
		System.out.println("THE BIKE IS RUNNING SAFELY");
		
	}

	@Override
	void getBikedetail() {
		System.out.println("THE MODEL OF THE BIKE IS RX100");
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		Yamaha y = new Yamaha();
		y.run();
		y.getBikedetail();

	}

}
