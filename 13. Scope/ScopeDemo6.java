package org.opentutorials.javatutorials.scope;

class C{
	int v=10;
	
	void m() {
		int v=20;
		System.out.println(v);//20
		System.out.println(this.v);//10, because 'this'.v points to the instance variable v.
	}
}

public class ScopeDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1 = new C();
		c1.m();
	}

}
