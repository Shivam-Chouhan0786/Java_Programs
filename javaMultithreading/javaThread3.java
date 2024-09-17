class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        // int i=0;
        String studentName = "ramkumar";
        System.out.println(studentName);
    }
}
public class javaThread3 {
    public static void main(String[] args) {
        MyThread obj1 =new MyThread("Shivam Chouhan");
        MyThread obj2 =new MyThread("Unknown");

        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
        System.out.println(obj2.getId());
        System.out.println(obj2.getName());
    }
}
