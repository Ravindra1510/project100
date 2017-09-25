package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={0,0,2,5,5,6,8,0,7,};
		Set set=new HashSet();
		for(int i:arr)
		{
			set.add(i);
		}
		
		int arr1[]=new int[set.size()];
		//System.out.println(arr1);
		int k=0;
		for(Object o:set)
		{
			arr1[k++]=((Integer)o).intValue();
		}
		System.out.println(Arrays.toString(arr1));

	}

}
