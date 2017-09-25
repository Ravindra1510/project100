package combinestudy;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hellollo";
		System.out.println(s1.length());
		System.out.println(s1.concat("hello"));
		System.out.println(s1);
		
		String s2=new String();
		System.out.println(s2.isEmpty());
		s2=s2.concat("rama");
		System.out.println(s2);
		System.out.println(s2.isEmpty());
		
		System.out.println("------------");

		
		System.out.println(s1.contains("dev"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(null));
		System.out.println(s1.equals(new String("Hell")));
		System.out.println(s1.equals(s1));
		System.out.println("hello".equals("hello"));
		System.out.println(new String("Hell").equals(new String("Hell")));
		System.out.println("  ".equals("  "));
		
		System.out.println("-------------");
		
		s1="Hello";
		System.out.println(s1.equalsIgnoreCase("hello"));
		System.out.println(s1);
		
		s1="javadeveloper";
		System.out.println(s1.indexOf('d'));
		System.out.println(s1.indexOf("deve"));
		System.out.println(s1.indexOf('a',2));
		//System.out.println(s1.indexOf("dev",5));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.startsWith("java"));
		
		System.out.println(s1.indexOf('o',8));
		
		System.out.println(s1.replace("e", "rama"));
		System.out.println(s1.replace('a', 'y'));
		
		System.out.println(s1.charAt(8));
		System.out.println(s1.charAt(s1.length()-3));
		
		char ch=s1.charAt(1);
		
		System.out.println(ch);
		
		//ystem.out.println(s1.replaceAll('l', 'L'));
		
		System.out.println("------");
		
		System.out.println("to".compareTo("ca"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println("sum of 4&5 is"+4+5);
		System.out.println("sum of 4&5 is"+(4+5));
				
		System.out.println("------------");
		
		String str="i love java and i love selenium and i love sheela ki javani";
		
		String s5="love";
		int index=0;
		int cntr=0;
		while(str.indexOf(s5,index)!=-1)
		{
			cntr++;
			index=str.indexOf(s5,index)+s5.length();
		}
		System.out.println("the number of accurance of"+s5+"is"+cntr+"times");
		System.out.println(s5.length());
		
		









		
		
	}

}

