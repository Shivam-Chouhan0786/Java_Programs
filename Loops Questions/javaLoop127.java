public class javaLoop127 {
    static boolean isPrime(int n){
        boolean c=true;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                c=false;
            }
        }
        return c;
    }
    public static void main(String args[]){
        int j=1;
        int c=0;
        for (int i = 1; i <=46; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
                c++;
            }
            if(c==j){
                j++;
                c=0;
                System.out.println();
            }
        }
    }
}
