package org.opentutorials.javatutorials.classinstance;

class Calculator3{
	
	//Ŭ���� �Ҽ� �޼ҵ�� sum�� ����!
	//static�� �پ��ִ°� �پ��ִ°ſ� �ٸ��� Ŭ������ ���� �����Ͽ� ��� ����.(calculator3.sum()����)
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
		//�� sum avg�Լ��� �ٸ� ���ڸ� ���� ����� ������� �� ������ ��.

	}

}
