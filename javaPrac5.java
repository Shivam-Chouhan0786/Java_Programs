import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class javaPrac5 {
	public static void main(String arg[])throws IOException{
		System.out.println("Enter any two no. => ");
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		String s1=br.readLine();
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for substraction");
		System.out.println("Press 3 for division");
		System.out.println("Press 4 for multiplication");
		
		InputStreamReader i2=new InputStreamReader(System.in);
		BufferedReader br2=new BufferedReader(i2);
		int x=(int)br2.read();
		StringTokenizer st=new StringTokenizer(s1,"  ");
		
		
		int numOne= Integer.parseInt(st.nextToken());
		int numTwo= Integer.parseInt(st.nextToken());
		// System.out.println(numOne);
		// System.out.println(x);
		// System.out.println(numTwo);
		switch(x){
			case 49:System.out.println("numOne + numTwo = "+(numOne+numTwo));
			break;
			case 50:System.out.println("numOne - numTwo = "+(numOne-numTwo));
			break;
			case 51:System.out.println("numOne * numTwo = "+(numOne*numTwo));
			break;
			case 52:System.out.println("numOne / numTwo = "+(numOne/numTwo));
			break;
		}
	}
}
