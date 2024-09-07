class Loop201
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				if(i==1||j==5||j==i)
				{
				System.out.print(j);					
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