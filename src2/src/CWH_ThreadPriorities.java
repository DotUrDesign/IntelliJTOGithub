/*
    There are three types of priorities for the threads to assign.
    1) MIN_PRIORITY = 1
    2) NORM_PRIORITY = 5
    3) MAX_PRIORITY = 10
 */
class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
        System.out.println(this.getName() + " thread started!");
    }
    public void run(){
        int count = 1;
        while(count < 100)
        {
            System.out.println(this.getName() + " thread is running!");
            count++;
        }
    }
}
public class CWH_ThreadPriorities {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Pratyush1");
        MyThread1 t2 = new MyThread1("Pratyush2");
        MyThread1 t3 = new MyThread1("Pratyush3");

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
