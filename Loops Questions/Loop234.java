class Loop234
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i*2-1;j++)
			{
				if(j==1||j==i*2-1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("0");
				}
			}
				System.out.println();
		}
	}
}