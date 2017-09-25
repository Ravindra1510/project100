package combinestudy;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java";
		String s2="Developer";
		String s3=s1+s2;
		
         System.out.println("s3="+s3);
         
         
         String s4="javaDeveloper";
         System.out.println("s4="+s4);
         
         System.out.println(s3.equals(s4));
         System.out.println(s3==s4);
         
         String s5="java"+"Developer";
         System.out.println(s3==s5);
         System.out.println(s3.equals(s5));
         
         String s6=s1+"Developer";			
         System.out.println(s3==s6);
         System.out.println(s4==s6);
         System.out.println(s4.equals(s6));
         
         
         System.out.println("-------------");








	}

}
