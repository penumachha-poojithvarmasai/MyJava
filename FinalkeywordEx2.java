package myjava;

class A
{
   final void display()
   {	  
      System.out.println("hi");
    }
}


class B extends A
{
   void display1()
 {
	super.display();
	System.out.println("hello");
 }
}
   
public class FinalkeywordEx2 {  
   public static void main(String args[])
   {

      B b=new B();
       b.display();
       b.display1();
   }


   }
