package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//system.in - ����ڰ� �Է��� ��
		//����ڰ� � ���� �־����� �˾Ƴ��� ����
		//sc�� ����
		int i=sc.nextInt();
		//nextInt()�ϰ� ���� ������� �Է°��� ��ٸ�.
		System.out.println(i*1000);
		sc.close();
		
	}

}
