class Loop238
{
	public static void main(String args[])
	{
		int n=64;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i+j==6||j-i==4||i-j==4||i+j==14)
				{
				System.out.printf("%c",n+i);					
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