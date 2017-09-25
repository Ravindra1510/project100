package Arrays;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={12,21,(int)10.78,(int)1.45};
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		double arr1[]={12.66,7,8,6.7};
		
		for(double d:arr1)
		{
			System.out.println(d);
		}
		
		int arr2[]={10,20,'a','b',30,'B',40,'A'};
		for(int i1:arr2)
		{
			System.out.println(i1);
		}
		
		
		int r[]={10,3,5,1,8,2};
		//System.out.println(Arrays.toString(r));
		
		for(int i5:r)
		{
			System.out.println(i5);
		}
		
		System.out.println("----------");
		
		Arrays.sort(r);
		System.out.println(Arrays.toString(r));
		
	}

}
