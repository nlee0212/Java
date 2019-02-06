package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	
	static int i;
	
	static void a() {
		i=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(i=0;i<5;i++) {
			a();
			System.out.println(i);
		}

	}

}

/*
 * static int i makes i a global variable.
 * so in the for loop, method a() changes i's value into 0,
 * making an infinite loop
 * however, if we write 'int i=0;' in method a, i becomes a local variable in a
 * which makes method a() doing nothing in the point of the main function
 * also, if we put int in front of the i in the for loop,
 * then it also becomes a local variable in the main function,
 * so the result would be just 0 1 2 3 4.
 * */
