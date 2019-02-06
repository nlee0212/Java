package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String password = args[1];
		
		if(id.equals("nayeon212")) {
			if(password.equals("980212")) {
				System.out.println("welcome nayeon :)");
			}
			else {
				System.out.println("wrong password :(");
			}
		}
		else {
			System.out.println("wrong ID :(");
		}
	}

}
