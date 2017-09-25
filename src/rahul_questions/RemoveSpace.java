package rahul_questions;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		String str="I love my india";
		String out="";
		
		//String s =str.replaceAll(" ", "");
		//System.out.println(s);
		
		String[] stra = str.split(" ");
		
		for(int i=0; i<=stra.length-1; i++)
		{
			out=out+stra[i];
		}
		
		System.out.println(out);
		
		
	}

}
