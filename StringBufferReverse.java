package myjava;

public class StringBufferReverse {

	public static void main(String[] args) {
		StringBuffer x=new StringBuffer("Hello");
		x.replace(1, 2, "JAVA");
		System.out.println(x);

	}

}
