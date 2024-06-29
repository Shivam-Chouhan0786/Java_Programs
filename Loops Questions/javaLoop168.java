public class javaLoop168 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                if (j == 5 || i == 1)
                    System.out.print("0 ");
                else if (j == 4 || j == 2 && i == 2 ) {
                    System.out.print("1 ");
                } else if (j == 3 && i == 3) {
                    System.out.print("2 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
