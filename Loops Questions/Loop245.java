class Loop245
{
	public static void main(String args[])
	{ 
		for(int i=5;i>=1;i--)
		{
			for(int s=5;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
			System.out.print(j);
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int s=5;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
			System.out.print(j);
			}
			System.out.println();
		}
	}
}