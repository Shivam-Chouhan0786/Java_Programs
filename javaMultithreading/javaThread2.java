
// By implementing Runnable interface

class RunnableThread1 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while (i<=100) {
            System.out.println("Runnable thread 1 is running...");
            i++;
        }
    }
}
class RunnableThread2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while (i<=100) {
            System.out.println("Runnable thread 2 is running_____");
            i++;
        }
    }
}
public class javaThread2 {
    public static void main(String[] args) {
        RunnableThread1 rt1 = new RunnableThread1();
        Thread t1=new Thread(rt1);
        t1.start();

        RunnableThread2 rt2 = new RunnableThread2();
        Thread t2=new Thread(rt2);
        t2.start();
        
    }
}
