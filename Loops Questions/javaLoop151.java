public class javaLoop151 {
    public static void main(String[] args) {

        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i+j>=n/2+2 && i+j<=n*2-n/2 && i-j<=n/2 && j-i<=n/2){
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
