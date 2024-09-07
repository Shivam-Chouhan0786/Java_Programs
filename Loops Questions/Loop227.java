class Loop227
{
	public static void main(String args[])
	{	
		int	k=80;
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.printf("%c",k-j);
			}
			k=80;
			System.out.println();					
		}
	}
}
