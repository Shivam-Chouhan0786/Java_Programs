public class javaLoop147 {
    public static void main(String[] args) {
        int l;
        for(int i=5;i>=1;i--){
            l=i-1;
            for(int k=i*2-1;k<=9;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if (j<=i) {
                    l++;
                    System.out.print(l +" ");
                }
                else{
                    l--;
                    System.out.print(l +" ");
                }
            }
            System.out.println();
        }
    }
}
