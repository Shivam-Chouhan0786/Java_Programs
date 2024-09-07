class Loop212
{
	public static void main(String args[])
	{
		int i,j;
		int k=64;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(i==j||i+j==10)
				{
				System.out.printf("%c",k+i);						
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