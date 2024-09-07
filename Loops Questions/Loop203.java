class Loop203
{
	public static void main(String args[])
	{
		int i,j;
		int k;
		for(i=1;i<=5;i++)
		{
			for(k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{				
				System.out.print(i+j);					
			}
			System.out.println();
		}
	}
}