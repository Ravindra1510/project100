package combinestudy;

class D
{
	/*void test(double d)
	{
		System.out.println("double argu method");

	}*/
	
/*	void test(Integer i)
	{
		System.out.println("Integer argu method");

	}
	
	void test(Number num)
	{
		System.out.println("Number argu");

	}*/
	
	void test(Object obj)
	{
		System.out.println("Object argu");

	}
	
	/*void test(int j)
	{
		System.out.println("int argu");

	}*/
}

public class Demo5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D d1=new D();
		d1.test(10);
		//d1.test(11.0);
		//d1.test(45);
		//d1.test(123);
		//d1.test(d1);

	}


}
