package org.opentutorials.javatutorials.overloading;

public class OverloadingDemo {
	
	void A () {
		System.out.println("void A()");
	}
	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}
	void A(String title) {
		System.out.println("void A(String title)");
	}
	/*
	 * if this exists, the program doesnt work.
	 * its because there are two method A's that has no parameter.
	 * only the return type differs.
	 * this results in an error.
	int A() {
		System.out.println("int A()");
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo a = new OverloadingDemo();
		a.A();
		a.A(1);
		a.A("hi everyone");
	}

}
