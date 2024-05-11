public class javaLoop128 {
    static boolean isNonPrime(int n){
        boolean c=false;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                c=true;
            }
        }
        return c;
    }
    public static void main(String args[]){
        int j=1;
        int c=0;
        for (int i = 1; i <=25; i++) {
            if(isNonPrime(i)){
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
