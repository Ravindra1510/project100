package qspiders;


abstract class A
{
	 abstract void print();
	
	static void disp()
	{
		System.out.println("hello");
	}
	
}

class B extends A
{
	void print()
	{
		System.out.println("print() method is implemented in class B");
	}
	
	
}

public class Demoabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B b1=new B();
      b1.disp();
      b1.print();
      A.disp();
      
     // B.print();

	}

}
