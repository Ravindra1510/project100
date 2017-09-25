package Arrays;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*int[][] arr={ {10,20,30} , {40,50,60} , {70,80,90} , {100,200}, {120} };
		
              for(int a[]:arr)
              {
            	  for(int i:a)
            	  System.out.print(i+" 	");
              }
              System.out.println();*/

		
		
		int[][] arr={ {3,5,7,8}, {4,2}, {5,7,8,6}, {6}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i]
					
					
					.length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
