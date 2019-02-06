package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"Jenny", "Jisoo", "Rose", "Lisa"};
		int i=0;
		
		for(i=0;i<members.length;i++) {
			String member=members[i]; // 오호 string끼리는 바로 =로 대입 가능하다!
			System.out.println(member+"가 상을 받았습니다!!!");
		}
	}

}
