package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//system.in - 사용자가 입력한 값
		//사용자가 어떤 값을 넣었는지 알아내는 역할
		//sc에 저장
		int i=sc.nextInt();
		//nextInt()하고 나면 사용자의 입력값을 기다림.
		System.out.println(i*1000);
		sc.close();
		
	}

}
