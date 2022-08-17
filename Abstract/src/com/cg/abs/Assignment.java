package com.cg.abs;

abstract class Movie{
	abstract String setTitle();
}
class MyMovie extends Movie{

	@Override
	String setTitle() {
		System.out.println("BEAUTY AND THE BEAST");
		return null;
	}
	
}

public class Assignment {

	public static void main(String[] args) {
		MyMovie m = new MyMovie();
		m.setTitle();
		

	}

}
