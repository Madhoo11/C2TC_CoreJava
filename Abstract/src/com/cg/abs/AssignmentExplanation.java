package com.cg.abs;
abstract class movie{
	String title;
	abstract void setTitle(String name);
}
class NewMovie extends movie{

	@Override
	void setTitle(String name) {
		// TODO Auto-generated method stub
		title = name;
	}
	String getTitle() {
		return title;
	}
	
}

public class AssignmentExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
