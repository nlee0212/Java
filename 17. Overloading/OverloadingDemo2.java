package org.opentutorials.javatutorials.overloading;

public class OverloadingDemo2 extends OverloadingDemo {
	
	void A(String title1, String title2) {
		System.out.println("void A(String title1, String title2)");
	}//overloading
	
	void A() {
		System.out.println("subclass : void A()");
	}//overriding

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();//the one which was overrode gets a higher priority
		od.A(1);
		od.A("hi everyone");
		od.A("hi everyone", "coding everyone");
	}

}
