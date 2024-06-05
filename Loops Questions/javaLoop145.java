public class javaLoop145 {
    public static void main(String[] args) {
        int l;
        for(int i=5;i>=1;i--){
            l=6;
            for(int k=i*2-1;k<=9;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
