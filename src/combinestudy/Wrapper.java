package combinestudy;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;

		Integer intObj= new Integer(100);
		System.out.println(intObj);
		
		int j=intObj.intValue();
		System.out.println(j);
		
		double d=intObj.doubleValue();//unboxing and autowidning
		System.out.println(d);
		
		Double d1=new Double(d);
		System.out.println(d1);
		
		int i1=(int)d1.doubleValue();
		System.out.println(i1);
		
		Double d2=new Double(12.56);
		System.out.println(d2);
		
		int i3=(int)d2.doubleValue();
		System.out.println(i3);
		
		byte b=123;
		Long l1=new Long(i);
		Long l2=new Long(b);
		System.out.println(l1);
		System.out.println(l2);
		
		long l3=100;
		Byte bb=new Byte((byte)l3);
		System.out.println(bb);
		
		System.out.println("=-----------");

		String s=l1.toString();
		System.out.println(s);

		Double d3=new Double(100);
		String s1=d3.toString();
		System.out.println(s1);
		
		Double.toString(10.22);
		Long.toString(100l);
		Byte.toString((byte)100);
		
		//String s3=l1;
		Long.toString(l1);
		
		
		String s11="123";
		String s12="423";
		
		String s13=Integer.toString(Integer.parseInt(s11)+Integer.parseInt(s12));
		System.out.println(s13);
		
		Integer ii=new Integer(123);
		Integer ii2=ii;
		System.out.println(ii==ii2);
		
		System.out.println(ii2);
		
		Integer ii3=Integer.valueOf(ii);
		System.out.println(ii==ii3);

		
		


		

		
		
		
		




		


		





	}

}
