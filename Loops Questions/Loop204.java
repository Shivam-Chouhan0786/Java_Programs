class Loop204
{
	public static void main(String args[])
	{
		int i,j;
		int n=1;
		for(i=1;i<=4;i++)
		{
			n=i;
			for(j=1;j<=4;j++)
			{
				if(n==5)
				{n=1;}
				System.out.print(n++);
			}
			System.out.println();
		}
	}
}