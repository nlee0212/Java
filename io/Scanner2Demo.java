package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {//입력한 게 숫자면 true, 아니면 false
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}
