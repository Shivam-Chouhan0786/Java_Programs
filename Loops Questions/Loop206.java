class Loop206
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=7;j++)
			{
				if(i==1||i+j==8)
				{
				System.out.print("7");
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