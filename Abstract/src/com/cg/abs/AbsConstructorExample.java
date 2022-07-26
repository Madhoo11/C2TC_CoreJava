package com.cg.abs;

abstract class Bike{

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("bike is created");
	}
	abstract void run(); 
	void changeGear() {
		System.out.println("gear changed");
	}
	
}
class Honda extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("the bike is running safley");
		
	}
	
}

public class AbsConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		h.run();
		h.changeGear();
		
		

	}

}
