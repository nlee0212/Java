package org.opentutorials.javatutorials.accessmodifier;

class A{
	public String y() {
		return "public String y()";
	}
	
	private String z() {
		return "private String z()";
	}
	
	public String x() {
		return z();
	}
}

public class AccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.y());
		//System.out.println(a.z());
		System.out.println(a.x());
	}

}

/*
* the second line doesn't work.
* it's because method z() is a private method.
* a private method can't be recognized by another class.
* so the class 'AccessDemo' can't reach z(), while class 'A' can.
* However, like method x(), we can reach a private method using a method in the class that contains z() by using it in the public method.
* Since when method x() is called, we are then in the class A, so we can reach any method whether it's private or public.
*/