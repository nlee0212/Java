package org.opentutorials.javatutorials.classinstance;

class C1{
	static int static_variable=1;
	int instance_variable=2;
	
	static void static_static() {
		//Ŭ���� �޼ҵ忡�� Ŭ���� ���� ����
		System.out.println(static_variable);
	}
	
	static void static_instance() {
		//Ŭ���� �޼ҵ忡�� �ν��Ͻ� ���� ����
		//System.out.println(instance_variable);
	}
	
	void instance_static() {
		//�ν��Ͻ� �޼ҵ忡�� Ŭ���� ���� ����
		System.out.println(static_variable);
	}
	
	void instance_instance() {
		//�ν��Ͻ� �޼ҵ忡�� �ν��Ͻ� ���� ����
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C1 c = new C1();
		
		//�ν��Ͻ��� ������ ���� Ŭ���� �޼ҵ忡 ���� -> ����
		//Ŭ���� �޼ҵ忡�� Ŭ���� ���� ���� -> ����
		//c.static_static();
		
		//�ν��Ͻ��� ������ ���� Ŭ���� �޼ҵ忡 ���� -> ����
		//Ŭ���� �޼ҵ忡�� �ν��Ͻ� ������ ���� -> ����
		//c.static_instance();
		
		//�ν��Ͻ��� ���� �ν��Ͻ� �޼ҵ忡 ���� -> ����
		//�ν��Ͻ� �޼ҵ带 ���� Ŭ���� ������ ���� -> ����
		//c.instance_static();
		
		//�ν��Ͻ��� ���� �ν��Ͻ� �޼ҵ忡 ���� -> ����
		//�ν��Ͻ� �޼ҵ忡�� �ν��Ͻ� ������ ���� -> ����
		//c.instance_instance();
		
		//Ŭ������ ���� Ŭ���� �޼ҵ忡 ���� -> ����
		//Ŭ���� �޼ҵ带 ���� Ŭ���� ������ ���� -> ����
		//C1.static_static();
		
		//Ŭ������ ���� Ŭ���� �޼ҵ忡 ���� -> ����
		//Ŭ���� �޼ҵ带 ���� �ν��Ͻ� ������ ���� -> ����
		//C1.static_instance();
		
		//Ŭ������ ���� �ν��Ͻ� �޼ҵ忡 ���� -> ���� (������ ���� �ȵ�)
		//C1.instance_static();
		
		//Ŭ������ ���� �ν��Ͻ� �޼ҵ忡 ���� -> ���� (������ ���� �ȵ�)
		//C1.instance_instance();
		

	}

}
