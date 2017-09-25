package qspiders;

class Orange
{
	static int cntr;
	
	Orange()
	{
		cntr++;
	}
}

class NagapurOrange extends Orange
{
	static int cntr1;
	
	NagapurOrange()
	{
		cntr1++;
	}
}

public class ObjectCountDemo {

	public static void main(String[] args)
	{
		Orange o1=new Orange();
		Orange o2=new Orange();
		new Orange();
		Orange o3=new Orange();
		
		System.out.println(Orange.cntr);
		
		
		NagapurOrange n1=new NagapurOrange();
		NagapurOrange n2=new NagapurOrange();
		NagapurOrange n3=new NagapurOrange();
		NagapurOrange n4=new NagapurOrange();
		
		System.out.println(NagapurOrange.cntr1);
		System.out.println(Orange.cntr);


		
	}
}
