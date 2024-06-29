public class javaLoop169 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (j == 4 || j == 1)
                    System.out.print("1 ");
                else if (j == 5 || j == 2) {
                    System.out.print("2 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
