package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	public static String[] BlackPink() {
		String[] members= {"Jenny", "Jisoo", "Rose", "Lisa"};
		return members;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members=BlackPink();
		for(String e : members) {
			System.out.println(e+'!');
		}
	}

}
