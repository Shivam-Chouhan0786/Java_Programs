class Loop235
{
	public static void main(String args[])
	{
		int k=0;
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				n=n+k;
				System.out.print(n);
				k++;					
			}
				System.out.println();
		}
	}
}



