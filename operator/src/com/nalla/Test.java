package com.nalla;
class One{
	int a,b,c;
	public One(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void assign_variable() {
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
	class Two extends One{
		public Two(int a, int b, int c) {
			super(a, b, c);
			
		}

		public void sum() {
		super.assign_variable();
			int c1=a+b;
		}
	}
class Three extends Two {
	public Three(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}

	public void display(Three three) {
		System.out.println("Total value is"+three
	
				
				);
	}
}
public class Test {
	public static void main(String[] args) {
		Three three = new Three(3,8,5);
		three.sum();
		three.display(three);
	}
}
