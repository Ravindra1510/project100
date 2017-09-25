package rahul_questions;

import java.util.Arrays;

public class Amstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr={10,20,30};
		for(int i=0;i<arr.length;i++)
		{
			arr[1]=0;
			System.out.println(arr[i]);
*/
			
		int arr[]={23,17,58,69,47};
		
		boolean flag=true;
		int temp=0;
		while(flag)
		{
			flag=false;
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
