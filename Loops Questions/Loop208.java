class Loop208
{
	public static void main(String args[])
	{
		int k=1;
		int n=64;
		for(int i=1;i<=5;i++)
		{
			for(int l=i;l<=5;l++)
			{
				System.out.print(" ");				
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2==1)
				{
					if(j==1)
					{	
					n++;				
					}
				System.out.printf("%c",n);				
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