public class javaLoop125 {
    public static void main(String args[]){
        int k=0;
        for (int i = 5; i >=1; i--) {
            for (int j = 5; j >i; j--) {
                System.out.print(++k);
            }
            System.out.println();

        }
    }
}
