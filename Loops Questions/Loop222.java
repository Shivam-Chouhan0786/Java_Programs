class Loop222
{
	public static void main(String args[])
	{ 
		int k=65;
		for(int i=1;i<=4;i++)
		{
			for(int s=5;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
			System.out.printf("%c",k);
			}
			k++;
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int s=i;s<=5;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
			System.out.printf("%c",k);
			}
			k++;
			System.out.println();
		}
	}
}