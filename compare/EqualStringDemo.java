package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello world";
		String b=new String("Hello world"); //new를 썼기 때문에 동일한 객체가 아님.
		System.out.println(a==b); // 동일한 객체가 아니기 때문에 false라 출력.
		System.out.println(a.equals(b));//일단 두 문자열을 비교할 떄는 .equals()를 쓴다!!
	}

}
