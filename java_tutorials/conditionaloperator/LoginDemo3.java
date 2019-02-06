package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String password = args[1];
		
		if(id.equals("nayeon212")&&password.equals("980212")) {
			System.out.println("right");
		}
		else
			System.out.println("wrong");
	}

}
