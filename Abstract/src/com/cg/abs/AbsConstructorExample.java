package com.cg.abs;

abstract class OfficeBike{

	public OfficeBike() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("bike is created");
	}
	abstract void run(); 
	void changeGear() {
		System.out.println("gear changed");
	}
	
}
class HeroHonda extends OfficeBike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("the bike is running safley");
		
	}
	
}

public class AbsConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroHonda h = new HeroHonda();
		h.run();
		h.changeGear();
		
		

	}

}
