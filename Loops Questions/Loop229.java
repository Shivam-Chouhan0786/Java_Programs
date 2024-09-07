class Loop229
{
	public static void main(String args[])
	{
		int k=5;
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=9;j++)
		{
			if(i>=j||i+j>=10)
			{
				System.out.print(k);
			}
			else
			{
				System.out.print(" ");
			}
			if(j>4)
			{
			k++;	
			}
			else
			{
			k--;
			}
		}
			k=5;
			System.out.println();
		}
	}
}