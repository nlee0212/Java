package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"Jenny", "Jisoo", "Rose", "Lisa"};
		int i=0;
		
		for(i=0;i<members.length;i++) {
			String member=members[i]; // ��ȣ string������ �ٷ� =�� ���� �����ϴ�!
			System.out.println(member+"�� ���� �޾ҽ��ϴ�!!!");
		}
	}

}
