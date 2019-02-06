package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				System.out.println(i+""+j);
			}
		}
		
		//그냥 i+j만 하면 숫자가 더해진다!
		//두 수를 그냥 이어서 쓰기만 하고 싶다면 중간에 blank char라도 넣어주기.
	}

}
