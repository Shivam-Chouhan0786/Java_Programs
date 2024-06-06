public class javaLoop158 {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j==1 || i==11 || i==j){
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
