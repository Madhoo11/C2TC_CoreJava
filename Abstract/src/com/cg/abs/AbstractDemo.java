package com.cg.abs;

abstract class Color{
abstract void rainbow();
abstract void  hill();
abstract class hill implements rainbow {


	
}


//Abstract class can have abstract,non-abstract methods and constructors.

class rain extends Color{

	@Override
	void rainbow() {
		System.out.println("rainbow is beautiful");
		
	}
	
}
class Demo implements rainbow,hill{
	
}






public class AbstractDemo {

	public static void main(String[] args) {
		System.out.println("rainbow has 7 colors");
		Color b = new rain();
		b.rainbow();
		
	}

}
