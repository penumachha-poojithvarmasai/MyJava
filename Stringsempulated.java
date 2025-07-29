package myjava;

public class Stringsempulated {

	public static void main(String[] args) {
		String s1="Poojith";
		String s2="Poojith";
		System.out.println(s1==s2);
		
		s1=s1+"varma";
		System.out.println(s1==s2);
		
		String s3="Poojithvarma";
		
		
		System.out.println(s1==s3);
		

	}

}
