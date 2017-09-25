package combinestudy;

public class Cherry {
	public static void main(String args[])
	{
		Cherry c1=new Cherry();
		System.out.println(c1);
		
		Cherry c2=new Cherry();
		System.out.println(c2);
		
		Class cls=c1.getClass();
		System.out.println(cls.getName()+"@"+Integer.toHexString(c1.hashCode()));
		
		
		
	}

}
