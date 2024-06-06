public class javaLoop152 {
    public static void main(String[] args) {
int k=1;
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i+j>=n/2+2 && i+j<=n*2-n/2 && i-j<=n/2 && j-i<=n/2){
                    System.out.print(k+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if (i>=5) {
                k--;
            }else{
                k++;
            }
            System.out.println();
        }
    }
}
