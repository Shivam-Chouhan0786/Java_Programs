public class javaLoop141 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=9;k>=i*2-1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
