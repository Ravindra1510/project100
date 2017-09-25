package Arrays;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[][]=new int[3][3];
	
	int val=10;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=val;
			//System.out.print(arr[i][j]);
			val+=10;
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]);
		}
		System.out.println();
		
	}
		
	
		
		
		
	}
	
	
	
	
		}

