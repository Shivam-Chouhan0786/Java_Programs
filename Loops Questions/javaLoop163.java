public class javaLoop163 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 && i == 3 || j == 3 && i == 3 || j == 1 && i == 5 || j == 5 && i == 5)
                    System.out.print("1 ");
                else if (i == 2 || i == 4 && j == 1 || i == 4 && j == 1 || i == 4 && j == 4)
                    System.out.print("0 ");
                else
                    System.out.print("2 ");
            }
            System.out.println();
        }
    }
}
