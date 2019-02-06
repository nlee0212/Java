package org.opentutorials.javatutorials.Inheritance2;

public class ConstructorDemo {

	/*
	 * 1. just declare a new instance using default class
	 * => it works!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c = new ConstructorDemo();
	}
	*/
	
	/*
	 * 2. making a constructor which includes an int parameter
	 * => it doesnt work!
	 * its because there only exists a constructor that uses a parameter.
	 * the line in the main func that declares a new instance c however wants a constructor that does not use a parameter.
	 * 
	public ConstructorDemo(int paramet1) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c = new ConstructorDemo();
	}
	*/
	
	/*
	 * 3. the code below works!
	 * we declared another constructor explicitly that doesnt use any parameter.
	 */
	
	public ConstructorDemo() {}
	
	public ConstructorDemo(int paramet1) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c = new ConstructorDemo();
	}

}
