public class javaLoop173 {
    public static void main(String args[]) {
        int n1 = -1;
        int n2 = 1;
        int n3;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                n3=n1+n2;
                System.out.print(n3+" ");
                n1=n2;
                n2=n3;
            }
            System.out.println();
        }

    }
}
