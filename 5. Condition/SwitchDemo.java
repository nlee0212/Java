package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch(1)"); // one two three
		switch(1) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(2)"); // two three
		switch(2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(3)"); // three
		switch(3) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(1) with break"); // one
		switch(1) {
		case 1:
			System.out.println("one"); break;
		case 2:
			System.out.println("two"); break;
		case 3:
			System.out.println("three"); break;
		}
		
		System.out.println("switch(2) with break"); // two
		switch(2) {
		case 1:
			System.out.println("one"); break;
		case 2:
			System.out.println("two"); break;
		case 3:
			System.out.println("three"); break;
		}
		
		System.out.println("switch(3) with break"); // three
		switch(3) {
		case 1:
			System.out.println("one"); break;
		case 2:
			System.out.println("two"); break;
		case 3:
			System.out.println("three"); break;
		}
		
		System.out.println("val=1");
		int val=1;
		if(val==1) {
			System.out.println("one");
		}
		else if(val==2) {
			System.out.println("two");
		}
		else if(val==3) {
			System.out.println("three");
		}
		
		System.out.println("switch(4) with default and break"); // three
		switch(4) {
		case 1:
			System.out.println("one"); break;
		case 2:
			System.out.println("two"); break;
		case 3:
			System.out.println("three"); break;
		default:
			System.out.println("out of boundary!"); break;
		}
		
	}

}
