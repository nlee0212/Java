package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"Jenny", "Jisoo", "Rose", "Lisa"};
		
		for(String e : members) {
			System.out.println(e + "가 상을 받았습니다!");
			//e에다가 members의 element를 바로 저장하여 사용!
		}
	}

}
