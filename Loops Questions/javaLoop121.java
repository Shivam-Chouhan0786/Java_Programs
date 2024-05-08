public class javaLoop121 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = i; j <= 7 ; j++) {
          
                if(j%2==1){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
            System.out.println();
        }
    }
}