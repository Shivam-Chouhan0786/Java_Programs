class Loop210
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(i==5||j==1||j==10||i>=j||i+j>=11)
				{
				System.out.print("*");						
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