package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true&&true)
			System.out.println(1);
		else if(false&&true)
			System.out.println(2);
		else if(true&&false)
			System.out.println(3);
		else if(false&&false)
			System.out.println(4);
		// only print 1
	}

}
