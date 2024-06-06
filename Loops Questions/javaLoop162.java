public class javaLoop162 {
    public static void main(String[] args) {
        int n=11;
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i==1 || j==1 || j==n || i==n || j==n/2+1 || i==n/2+1 || i+j==n/2+2|| i-j==n/2 || i+j==n/2+i*2|| i+j==n/2+n+1 ) {
                    System.out.print("* ");                    
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
