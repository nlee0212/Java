package org.opentutorials.javatutorials.classinstance;

class Calculator3{
	
	//클래스 소속 메소드로 sum이 생성!
	//static이 붙어있는건 붙어있는거와 다르게 클래스에 직접 연결하여 사용 가능.(calculator3.sum()이케)
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
		//각 sum avg함수에 다른 인자를 넣은 결과를 내고싶을 때 유용할 듯.

	}

}
