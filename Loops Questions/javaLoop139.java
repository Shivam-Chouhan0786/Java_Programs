public class javaLoop139 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i%2==1){
                    System.out.print(i);
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
