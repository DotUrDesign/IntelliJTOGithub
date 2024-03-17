
class MyThread1 extends Thread{
    @Override
    public void run(){
        int count = 0;
        while(count < 1000000)
        {
            System.out.println("Thread 1 is running!");
            System.out.println(" I am a good boy");
            count++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int count = 0;
        while(count < 1000000)
        {
            System.out.println("Thread 2 is running!");
            System.out.println("I am a bad boy");
            count++;
        }
    }
}

public class CWH_Multithreading_ThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // Sometimes, the console is executing the code of thread1 and sometimes of thread2, which shows the CPU scheduler is actually switching between the two threads giving each thread some time to execute. This proves, the picture of concurrency in multithreading.
        t1.start();  // start function is used to run the above threads.
        t2.start();
    }
}
