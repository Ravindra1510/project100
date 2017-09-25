package Arrays;

public class SamplePattern {
	
	public static void main(String[] args) {
		
		String str="HELLO";
		
		
		int times=1;
		int space=4;
		int lines=5;
		int ch=0;
		int c=3;
		for(int i=1; i<=lines; i++)
		{
			int mid= (times+1)/2;
			
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=times; k++)
			{
				if(k==mid&&i!=lines)
				{
					System.out.print(str.charAt(ch));
				}
				else if(i!=1&&k==1&&i!=lines||i!=1&&k==times&&i!=lines)
				{
					System.out.print("*");
				}
				else if(i==lines)
				{
					if(k<=mid)
					{
						System.out.print(str.charAt(k-1));
						
					}
					else
					{
						
						System.out.print(str.charAt(c));
						c--;
					}
						
				}
				else
				{
					System.out.print(" ");
				}
										
			}
			
			System.out.println();
			
			times=times+2;
			space--;
			ch++;
			
			}
			
		}
		
		
	}


