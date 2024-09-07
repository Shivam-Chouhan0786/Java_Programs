class Loop250
{
	public static void main(String ar[])
	{
		int c=64;
		for(int i=4;i>=1;i--)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");				
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.printf("%c",c+j);
			}
			System.out.println();
		}
		for(int i=2;i<=4;i++)
		{
			for(int k=i;k<=4;k++)
			{
				System.out.print(" ");				
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.printf("%c",c+j);
			}
			System.out.println();
		}
	}
}