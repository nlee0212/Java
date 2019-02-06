package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
	
	static int i=5;
	
	static void a() {
		int i=10;
		b();
	}
	
	static void b() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
	}

}

/*
 * 1. main func. calls method a
 * 2. in method a, a new local variable i is declared
 * 	  i is set to be 10.
 * 	  then a calls method b.
 * 3. b prints out i, but then since i which contains 10 was only a local variable, 
 *    method b uses the global variable i which was set to be 5.
 * as a result '5' is printed.
*/