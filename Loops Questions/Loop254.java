class Loop254
{
	public static void main(String arg[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=6;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				if(j%2==1)
				{
				System.out.print("1");					
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}