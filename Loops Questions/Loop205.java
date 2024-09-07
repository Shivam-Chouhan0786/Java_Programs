class Loop205
{
	public static void main(String args[])
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
				System.out.printf("%c",64+j);
			}
			System.out.println();
		}
	}
}