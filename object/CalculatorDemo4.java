package org.opentutorials.javatutorials.object;

class Calculator{
	int left, right;
	
	//this.left/this.right는 calculator 정의할 때 인스턴스 자신을 의미 즉 객체 전역에 잇는 변수left right
	public void setOprands(int left, int right) {
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

public class CalculatorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20,40);
		c2.sum();
		c2.avg();

	}

}

//클래스를 한 번밖에 사용하지 않았지만, new라는 기능을 이용하여 두가지의 인스턴스를 활용
//두 가지의 인스턴스를 활용하여 두개의 비슷한 반복되는 절차를 손쉽게 진행