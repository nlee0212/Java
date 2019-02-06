package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
	public static String numbering(int init, int limit) {
		int i=init;
		String output = "";
		while (i<limit) {
			output+=i;
			output+=" ";
			i++;
		}
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(2,5);
		System.out.println(result);
	}
}
