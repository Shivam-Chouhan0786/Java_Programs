class Loop252
{
	public static void main(String arg[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1||i==j||j==1)
				{
				System.out.print("*");					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}