package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	public static void numbering() {
		int i=0;
		while (i<10) {
			System.out.println(i);
			i++;
		}//정의
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbering();//호출
		numbering();
		numbering();
	}

}
