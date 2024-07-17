// addition of n number using command line arguement

class javaPrac10{
	public static void main(String ar[]){
		int sum=0;
		for(String val:ar){
			sum=sum+Integer.parseInt(val);
		}
			System.out.println("Sum of given number = "+sum);
	}
}