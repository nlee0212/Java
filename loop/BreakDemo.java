package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i=1;i<10;i++) {
			if(i==5)
			{
				System.out.println("five!");
				break;
				
			}
			System.out.println("hi!");
			
		}
	}

}
