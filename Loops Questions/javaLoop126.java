public class javaLoop126 {
    public static void main(String args[]){
        int a=1;
        int b=-1;
        int c=0;
        for (int i = 5; i >=1; i--) {
            for (int j = 5; j >i; j--) {
                c=a+b;
                System.out.print(c+" ");
                b=a;
                a=c;
            }
            System.out.println();

        }
    }
}
