package combinestudy;


abstract class AbDemo1
{
	static void paint()
	{
		System.out.println("hi");

	}
}


class ConDemo extends AbDemo1
{
	static void paint()
	{
		System.out.println("hi in con");

	}

}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbDemo1 a1=new ConDemo();
		a1.paint();
		
		ConDemo d1=(ConDemo) a1;
		d1.paint();
		

	}

}
