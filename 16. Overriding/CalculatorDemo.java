package org.opentutorials.javatutorials.overriding;

class Calculator{
	int left, right;
	
	public Calculator(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public int avg() {
		return ((this.left+this.right)/2);
	}
}

class Calwithsub extends Calculator{
	public Calwithsub(int left, int right) {
		super(left,right);
	}
	
	public void sub() {
		System.out.println(this.left-this.right);
	}
	
	public void sum() {
		System.out.println("실행결과는 " + (this.left+this.right) + "입니다.");
	}
	
	/*
	 * this doesn't work - the return type differs from the higher class' method avg()
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	*/
	
	public int avg() {
		return super.avg();//then we can get the return value from the higher class' method avg()
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calwithsub c1 = new Calwithsub(10,20);
		c1.sum();
		System.out.println("실행결과는 " + c1.avg() + "입니다.");
		c1.sub();
	}

}

/*
 * if an 'overriding' is done,
 * then the newly-overrode method gets a higher priority.
 * 
 * ***for a successful overriding to be done***
 * 1. the name should be the same
 * 2. the return type should be the same
 * 3. the number, the data types, and the sequence of the parameters should be the same
 */
