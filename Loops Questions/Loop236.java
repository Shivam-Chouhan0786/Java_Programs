class Loop236
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>=6&&i<=5||i+j<=10&&i>5)
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