package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i=0;i<10;i++) {
			if(i==5)
				continue;
			//i가 5일 때 아래 출력부분을 생략하고 바로 다음 단계로 넘어감.
			System.out.println("hehe"+i);
		}
	}

}
