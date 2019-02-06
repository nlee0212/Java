package org.opentutorials.javatutorials.classinstance;

class C1{
	static int static_variable=1;
	int instance_variable=2;
	
	static void static_static() {
		//클래스 메소드에서 클래스 변수 접근
		System.out.println(static_variable);
	}
	
	static void static_instance() {
		//클래스 메소드에서 인스턴스 변수 접근
		//System.out.println(instance_variable);
	}
	
	void instance_static() {
		//인스턴스 메소드에서 클래스 변수 접근
		System.out.println(static_variable);
	}
	
	void instance_instance() {
		//인스턴스 메소드에서 인스턴스 변수 접근
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C1 c = new C1();
		
		//인스턴스를 생성한 다음 클래스 메소드에 접근 -> 성공
		//클래스 메소드에서 클래스 변수 접군 -> 성공
		//c.static_static();
		
		//인스턴스를 생성한 다음 클래스 메소드에 접근 -> 성공
		//클래스 메소드에서 인스턴스 변수에 접근 -> 실패
		//c.static_instance();
		
		//인스턴스를 통해 인스턴스 메소드에 접근 -> 성공
		//인스턴스 메소드를 통해 클래스 변수에 접근 -> 성공
		//c.instance_static();
		
		//인스턴스를 통해 인스턴스 메소드에 접근 -> 성공
		//인스턴스 메소드에서 인스턴스 변수에 접근 -> 성공
		//c.instance_instance();
		
		//클래스를 통해 클래스 메소드에 접근 -> 성공
		//클래스 메소드를 통해 클래스 변수에 접근 -> 성공
		//C1.static_static();
		
		//클래스를 통해 클래스 메소드에 접근 -> 성공
		//클래스 메소드를 통해 인스턴스 변수에 접근 -> 실패
		//C1.static_instance();
		
		//클래스를 통해 인스턴스 메소드에 접근 -> 실패 (컴파일 조차 안됨)
		//C1.instance_static();
		
		//클래스를 통해 인스턴스 메소드에 접근 -> 실패 (컴파일 조차 안됨)
		//C1.instance_instance();
		

	}

}
