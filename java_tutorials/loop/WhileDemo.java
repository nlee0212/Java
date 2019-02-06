package org.opentutorials.javatutorials.loop;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<10) {
			System.out.println("hi"+i);
			i++;
		}
		
		i=0;
		while(i<10) {
			System.out.println("hi"+i++);
		}
		
		i=0;
		while(i<10) {
			System.out.println("hi"+(++i));
		}
		
		i=0;
		while(i<10) {
			System.out.println("hi"+(i+1)*2);
			i++;
			//hi(2n)
		}
		
	}

}
