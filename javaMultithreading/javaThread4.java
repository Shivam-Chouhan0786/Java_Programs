class newThread1 implements Runnable{
    private int i;
    public newThread1(int i){
        this.i=i;
    }
    public void run(){
        // try {
        //     Thread.sleep(200);
        // } catch (Exception e) {
        //    System.out.println(e);
        // }
        synchronized(System.out){
            System.out.println(i);
        }
    }
}
public class javaThread4 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            Thread t1 = new Thread(new newThread1(i));
            t1.start();
        }
    }
}
