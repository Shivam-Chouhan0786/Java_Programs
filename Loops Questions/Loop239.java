class Loop239
{
	public static void main(String args[])
	{
		for(int i=2;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				System.out.print("*");
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				System.out.print("*");
			}
			System.out.println();
		}
		// for(int i=6;i>=1;i--)
		// {
			// for(int k=6;k>=i;k--)
			// {
				// System.out.print(" ");
			// }
			// for(int j=1;j<=i*2-1;j++)
			// {
				// System.out.print("*");
			// }
			// System.out.println();
		// }
	}
}