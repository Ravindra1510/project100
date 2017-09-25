package rahul_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		
		Integer[] a={1,5,5,6,9,7,6};
		
		 
		
		Set<Integer> s = new HashSet<Integer>(Arrays.asList(a));
		
		for(Integer i : s)
		{
			System.out.println(i);
		}
		
	}

}
