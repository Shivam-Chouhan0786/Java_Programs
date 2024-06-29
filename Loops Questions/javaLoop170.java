public class javaLoop170 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            int k = 1;
            for (int j = 1; j <= 5; j++) {
                if (i == 3 || j == 3)
                    System.out.print("3 ");
                else if (i == 2 || i == 4)
                    System.out.print("2 ");
                else {
                    if (j < 3)
                        System.out.print(k++ + " ");
                    else
                        System.out.print(--k + " ");
                }
            }
            System.out.println();
            k = 1;
        }
    }
}
