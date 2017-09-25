package combinestudy;

abstract interface IDemo1
{
	abstract void test();
}

class ConDem implements IDemo1
{
	public void test()
	{
System.out.println("hi");
	}
}

public class Demo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDemo1 i1=new ConDem();
		i1.test();

	}

}
