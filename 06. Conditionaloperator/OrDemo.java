package org.opentutorials.javatutorials.conditionaloperator;

public class OrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean yes=true;
		boolean no=false;
		
		if(true||yes)
			System.out.println(1);
		if(yes||no)
			System.out.println(2);
		if(no||yes)
			System.out.println(3);
		if(no||false)
			System.out.println(4);
		// print out 1 2 3
		
	}

}
