class Loop216
{
	public static void main(String args[])
	{
		int k=1;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i*2-1;j++)
				{
					if(j==1||j==i*2-1)
					{
					System.out.print("*");
					}					
					else
					{
						System.out.print(k);
						if(j<i)
						{
						k++;	
						}
						else
						{
						k--;
						}
					}
				}
					k=1;
			System.out.println();			
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i*2-1;j++)
				{
					if(j==1||j==i*2-1)
					{
					System.out.print("*");											
					}
					else
					{
						System.out.print(k);
						if(j<i)
						{
						k++;	
						}
						else
						{
						k--;
						}
					}
				}
				k=1;
			System.out.println();			
		}
	}
}