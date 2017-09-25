package Arrays;	
class Apple
{
	
}

public class Demo1 {
	
	public static int add(int[] nums)
	{
		
		 int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=sum+i;
			
			
		}
		return sum ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr[]=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		
		/*String arr[]=new String[3];
		
		arr[0]="i";
		arr[1]="love";
		arr[2]="java";
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		
	/*	int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------");
		
		int arr1[];
		arr1=new int[5];
		
		int val=10;
		for(int j=0;j<arr1.length;j++)
		{
			arr1[j]=val;
			//System.out.println(arr1[j]);
			 val+=10;
		}
		for(int j=0;j<arr1.length;j++)
		{
			System.out.println(arr1[j]);			
			
			
		}*/
		
		
	/*	int arr[]={10,20,30,40,50};
		for(int i:arr)
		{
			System.out.println(i);
		}*/
		
		
		
	/*	int arr[]={};
		System.out.println(arr.toString());*/
		
		/*int arr[]=new int[3];
		arr[0]=10;
		for(int i:arr)
			System.out.println(i);*/
		
		String arr1[]=new String[3];
		arr1[0]="hello";
		for(String s:arr1)
		
		System.out.println(s);
		
		
		Apple arr[]=new Apple[3];
		arr[0]=new Apple();
		
		for(Apple a:arr)
		{
			System.out.println(a);
		}
		
		int[] values={10,20,30,40,50};
		int tot=add(values);
		System.out.println(tot);
		
				
		
		
		
		
		
	}

	 

}
