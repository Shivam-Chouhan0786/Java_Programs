public class javaLoop129 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++);
                if (k == 5) {
                    k = 0;
                }
            }
            System.out.println();
        }
    }
}
