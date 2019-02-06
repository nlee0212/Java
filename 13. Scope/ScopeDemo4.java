package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		//System.out.println(i);
	}

}

/*
 * this code also doesnt work.
 * since int i was declared in the for loop, it only exists in the loop.
 * even tho the two i's are in the same func 'main',
 * i only exists in the for loop so the main func thinks that the i outside the loop exists nowhere.
 */