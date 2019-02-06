package org.opentutorials.javatutorials.overloading;

class Calculator{
	int left, right, third;
	
	public void setOprands(int left, int right){
		this.left=left;
		this.right=right;
		this.third=0;
	}
	
	public void setOprands(int left, int right, int third) {
		//this.left=left;
		//this.right=right;
		this.setOprands(left, right);//this code does the same thing with the method setOprands with two parameters
		this.third=third;
	}
	
	public void sum() {
		System.out.println(this.left+this.right+this.third);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+this.third)/3);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		c.setOprands(10, 20, 30);
		c.sum();
		c.avg();
	}

}
