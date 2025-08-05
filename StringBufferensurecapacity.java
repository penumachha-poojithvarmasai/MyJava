package myjava;

public class StringBufferensurecapacity {

	public static void main(String[] args) {
		StringBuffer x=new StringBuffer();
		System.out.println(x.capacity());
		x.append("java");
		System.out.println(x.capacity());
		x.append("It is a StringBuffer Capacity");
		System.out.println(x.capacity());
		x.ensureCapacity(10);
		System.out.println(x.capacity());
		x.ensureCapacity(50);
		System.out.println(x.capacity());
		
		

	}

}
