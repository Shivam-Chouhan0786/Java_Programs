public class javaLoop149 {
    public static void main(String[] args) {
        int n = 41;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n ||i==j || j+i==n+1 || i+j==n+n/2 || j+i==n-n/2+1 || i-j==n/2 || j-i==n/2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
