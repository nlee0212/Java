package org.opentutorials.javatutorials.scope;

public class ScopeDemo3 {
	
	static void a() {
		String title = "BlackPink in your Area";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		//System.out.println(title);
	}

}

/*
 * this doesnt work because the string variable 'title' is a local variable.
 * it only exists in the method a, so the main function would not be able to know what 'title' is.
 * in main's point of view, the variable title doesnt exist.
 * */
