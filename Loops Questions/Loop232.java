class Loop232
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3)
				{
					System.out.print("0");
				}
				else if(i==2&&j==1||i==2&&j==5||i==4&&j==1||i==4&&j==5||i==6&&j==1||i==6&&j==5)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");					
				}
			}
				System.out.println();
		}
	}
}