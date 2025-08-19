package myjava;

public class FinalkeywordEx {
	public static void main(String arg[]) {
		int x=10;
		final int y=20;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		
		x=15;
	    //y=25; by using y it not compiling because y is finalised
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		
		
	}

}
