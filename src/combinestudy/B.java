package combinestudy;

class Orange
{
	int wt;
	
	Orange(int wt)
	{
		this.wt=wt;
	}
	
	public String toString()
	{
		return "wt="+wt;
	}
	
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		
		if(obj instanceof Orange)
		{
			if(this.wt==((Orange)obj).wt)
				return true;
			
		}
		return false;
	}
	
	public int hashcode()
	{
		return wt*5*7*11*13*17;
	}
	
	}
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Orange o1=new Orange(100);
Orange o2=new Orange(120);
Orange o3=new Orange(100);

System.out.println(o1);
System.out.println(o2);
System.out.println(o3);

System.out.println(o1==o2);
System.out.println(o1.equals(o3));

System.out.println(o1.hashcode());
System.out.println(o2.hashcode());
System.out.println(o3.hashcode());

System.out.println(o1.equals(o3));




  







	}

}
