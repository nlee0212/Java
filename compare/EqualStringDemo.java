package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello world";
		String b=new String("Hello world"); //new�� ��� ������ ������ ��ü�� �ƴ�.
		System.out.println(a==b); // ������ ��ü�� �ƴϱ� ������ false�� ���.
		System.out.println(a.equals(b));//�ϴ� �� ���ڿ��� ���� ���� .equals()�� ����!!
	}

}
