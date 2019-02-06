package org.opentutorials.javatutorials.Inheritance2;

class Calculator{
	int left, right;
	
	//public Calculator() {}
	//this code is unnecessary if super(left, right) is declared in the subclass.
	//however, if the constructor in the subclass looked like:
	/*
	 * public Calculatorwithsub(int left, int right){
	 * 		this.left=left;
	 * 		this.right=right;
	 * }
	 */
	//then the line above would be necessary.
	
	public Calculator(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class Calculatorwithsub extends Calculator{
	public Calculatorwithsub(int left, int right) {
		super(left, right);
	}
	
	public void sub() {
		System.out.println(this.left-this.right);
	}
}

public class ConstructorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorwithsub c1 = new Calculatorwithsub(10,20);
		c1.sum();
		c1.avg();
		c1.sub();
	}

}
