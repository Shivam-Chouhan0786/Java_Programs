public class javaLoop155 {
    public static void main(String[] args) {
        int l=1;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=n;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j==1 || j==i*2-1){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(l+++" ");
                }
            }
            System.out.println();
        }
    }
}
