package com.cg.abs;
abstract class shape{
	abstract void draw();
}
class Rectangle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}
	
}
class Circle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
		
		
	}
	
}

public class ShapeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape h = new Rectangle();
		h.draw();
		shape c = new Circle();
		c.draw();

	}

}
