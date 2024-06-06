public class javaLoop154 {
    public static void main(String[] args) {
        int l=1;
        for(int i=1;i<=5;i++){
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+l++)+" ");
            }
            System.out.println();
        }
    }
}
