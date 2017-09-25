package rahul_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,7,0,1,1,7,6,6,9,9};
		
		Set s=new HashSet();
		
		for(int i:arr)
		{
			s.add(i);
			

		}
		//System.out.println(s);
		int arr1[]=new int[s.size()];
		
		int k=0;

	
		
	for(Object o:s)
	{
		
	arr1[k++]=((Integer)o).intValue();
	}
		System.out.println(Arrays.toString(arr1));

	}

}
