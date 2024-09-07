class Loop219
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j>1&&j<7&&i==1||j>1&&j<7&&i==7||j==1&&i!=1&&i!=7||j==7&&i!=1&&i!=7)
				{
				System.out.print("1");					
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