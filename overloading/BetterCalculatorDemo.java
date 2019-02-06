package org.opentutorials.javatutorials.overloading;

class BetterCalc{
	int[] arr;
	
	public void setOprands(int[] arr) {
		this.arr=arr;
	}
	
	public void sum() {
		int total=0;
		for(int value : this.arr)
			total+=value;
		System.out.println(total);
	}
	
	public void avg() {
		int total=0;
		for(int value : this.arr)
			total+=value;
		System.out.println(total/this.arr.length);
	}
}

public class BetterCalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetterCalc c = new BetterCalc();
		System.out.println("c.setOprands(new int[] {10,20})");
		c.setOprands(new int[] {10,20});
		c.sum();
		c.avg();
		System.out.println("c.setOprands(new int[] {10,20,30})");
		c.setOprands(new int[] {10,20,30});
		c.sum();
		c.avg();
	}

}
