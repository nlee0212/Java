package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
	static void a() {
		int i=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i=0;i<5;i++) {
			a();
			System.out.println(i);
		}
		
		//if int i in method a was considered in main,
		//then there would be infinite numbers of 0 printed.
		//but the result was 0 1 2 3 4
		//its because int i didnt make any changes in main func.
		//the only i in the main func would just be increasing by 1 by the for loop.
	}

}
