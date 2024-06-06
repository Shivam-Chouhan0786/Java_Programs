public class javaLoop159 {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            for (int k = i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                if(j==11 || i==1 || i==j){
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
