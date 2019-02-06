package org.opentutorials.javatutorials.classinstance;

class Calculator{
	static double PI = 3.14;
	//'static'이라는 단어에 주의!!
	//static이 붙으면 그 뒤에 오는 변수는 static 하다. 즉 변수가 클래스 소속이 된다!
	//즉 모든 인스턴스에서 동일한 값을 가지게 된다!
	int left, right;
	
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

public class CalculatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1=new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2=new Calculator();
		System.out.println(c2.PI);
		
		System.out.println(Calculator.PI); 

	}

}
