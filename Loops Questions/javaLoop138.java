public class javaLoop138 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i%2==1){
                    System.out.print(i*j);
                }
                else if(i==2){
                    System.out.print(j);
                }
                else{
                    System.out.print(j*2);

                }
            }
            System.out.println();
            
        }
    }
}
