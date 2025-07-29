package myjava;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println(i);
			
		}
		input.close();
	}

}
