package org.opentutorials.javatutorials.Inheritance;

class Calculatorwithmul extends Calculator{
	public void mul() {
		System.out.println(this.left*this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorwithmul c1 = new Calculatorwithmul();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.mul();
	}

}
