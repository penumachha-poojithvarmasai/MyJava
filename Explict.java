package myjava;

public class Explict {

	public static void main(String[] args) {
		int a=10;
		byte b;
		double c= 3.1459;
		System.out.println("Conversion of int to byte");
		b=(byte)a;
		System.out.println("a and b "+ a +"and" + b);
		System.out.println("Conversion of double to byte");
		b=(byte)c;
		System.out.println("c and b"+c+"and"+b);
		

	}

}
