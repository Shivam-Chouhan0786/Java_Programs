public class javaLoop166 {
    public static void main(String[] arg) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i<=j){
                    System.out.print(j);
                    }
                    else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
