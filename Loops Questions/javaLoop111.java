public class javaLoop111 {
    public static void main(String[] args) {
        for (int i = 2; i <= 6; i++) {
            for (int j = i; j <= 4 + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
