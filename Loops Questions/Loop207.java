class Loop207
{
	public static void main(String args[])
	{
	int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int l=i;l<=4;l++)
			{
				System.out.print(" ");				
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print(k*k);
				k++;
			}
			System.out.println();
		}
	}
}