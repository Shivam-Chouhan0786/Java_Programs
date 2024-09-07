class Loop242
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int k=i;k<=9;k++)
				{
					System.out.print(" ");
				}
			for(int j=1;j<=i*2-1;j++)
			{
				if(i==j||i==2||i==3||(i==4&&j>=3&&j<=5)||(i==5&&j>=3&&j<=7)||(i==6&&j>=3&&j<=9)||(i==9&&j>=6&&j<=12))
				{
				System.out.print("*");					
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