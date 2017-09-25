
package combinestudy;


abstract class AbDemo2
{
	void test1()
	{
		System.out.println("hi");

	}
	
	abstract void test2();
}

abstract class AbDemo3 extends AbDemo2
{
	void test2()
	{
		System.out.println("test2 in abdem3");

	}
}

class ConDemo2 extends AbDemo3
{
	
}




public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbDemo2 a=new ConDemo2();
		a.test1();
		a.test2();
		

	}

}
