package myjava;

abstract class AbstractDemo1
{
  public void anotherMethod()
   {
      System.out.println(" another method");
    }
      abstract public void myMethod(); 
}

 class english extends AbstractDemo1
 {
    public void myMethod()
    {
    System.out.println(" Good Morning");
    } 
 }

 
 class french extends AbstractDemo1
 {
	public void myMethod()
	{
	System.out.println(" bonjour");
	}
  }


class german extends AbstractDemo1
 {
    public void myMethod()
    {
       System.out.println(" Guten Morgen");
      }
 }

public class Abstractkeyword {
	
	 public static void main(String args[]) 
	 {  
	english e=new english();
	e.myMethod();

	french f=new french();
	f.myMethod();

	german g=new german();
	g.myMethod();
	 
	 }    
	 

}
