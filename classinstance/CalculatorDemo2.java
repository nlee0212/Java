package org.opentutorials.javatutorials.classinstance;

class Calculator2{
	static double PI = 3.14;
	//'static'�̶�� �ܾ ����!!
	//static�� ������ �� �ڿ� ���� ������ static �ϴ�. �� ������ Ŭ���� �Ҽ��� �ȴ�!
	//�� ��� �ν��Ͻ����� ������ ���� ������ �ȴ�!
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+base)/2);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		c1.sum();//30
		
		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40);
		c2.sum();//60
		
		Calculator2.base=10;
		
		c1.sum();//40
		c2.sum();//70
		

	}

}
