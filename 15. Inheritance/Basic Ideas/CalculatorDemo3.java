package org.opentutorials.javatutorials.Inheritance;


class Calculatorwithdiv extends Calculatorwithmul{
	public void div() {
		System.out.println(this.left/this.right);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorwithdiv c1 = new Calculatorwithdiv();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.mul();
		c1.div();
	}

}
