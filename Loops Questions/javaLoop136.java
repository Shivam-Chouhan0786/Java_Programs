public class javaLoop136 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k=5;
            for (int j = 1; j <= 5; j++) {
                if (i%2==1) {
                    System.out.print(j);
                }
                else{
                    System.out.print(k--);
                }
            }
            System.out.println();
        }
    }
}
