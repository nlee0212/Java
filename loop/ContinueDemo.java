package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i=0;i<10;i++) {
			if(i==5)
				continue;
			//i�� 5�� �� �Ʒ� ��ºκ��� �����ϰ� �ٷ� ���� �ܰ�� �Ѿ.
			System.out.println("hehe"+i);
		}
	}

}
