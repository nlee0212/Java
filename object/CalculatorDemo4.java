package org.opentutorials.javatutorials.object;

class Calculator{
	int left, right;
	
	//this.left/this.right�� calculator ������ �� �ν��Ͻ� �ڽ��� �ǹ� �� ��ü ������ �մ� ����left right
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

//Ŭ������ �� ���ۿ� ������� �ʾ�����, new��� ����� �̿��Ͽ� �ΰ����� �ν��Ͻ��� Ȱ��
//�� ������ �ν��Ͻ��� Ȱ���Ͽ� �ΰ��� ����� �ݺ��Ǵ� ������ �ս��� ����