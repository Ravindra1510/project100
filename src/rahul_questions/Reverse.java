package rahul_questions;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s1="Bangalore";
		StringBuffer str=new StringBuffer(s1);
	str=	str.reverse();
	str.toString();
	System.out.println(str);
*/
		
		int i=12345;
		
		/*String s1=Integer.toString(i);
		//System.out.println(s1);
		StringBuffer str=new StringBuffer(s1);
		str.reverse();
		System.out.println(str);*/
		
		while(i>0)
		{
			int rem=i%10;
			System.out.print(rem);
			i=i/10;
		}
	}

}
