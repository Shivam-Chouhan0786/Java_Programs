public class javaLoop135 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int res= i+j;
                if (res%2==1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
