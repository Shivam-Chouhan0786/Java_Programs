class Loop202
{
	public static void main(String args[])
	{
		int i,j;
		int k;
		for(i=5;i>=1;i--)
		{
			for(k=i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j<=5;j++)
			{				
				System.out.print(j*2-1);					
			}
			System.out.println();
		}
	}
}