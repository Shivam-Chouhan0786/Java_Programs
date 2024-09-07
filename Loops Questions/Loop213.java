class Loop213
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
				System.out.print("3");
				}
				if(i!=1&&i!=5&&j>1&&j<5)
				{
				if(i==3&&j==3)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("2");					
				}
				}
			}
		System.out.println();
		}
	}
}