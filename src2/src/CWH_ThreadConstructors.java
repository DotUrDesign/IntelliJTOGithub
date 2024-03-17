/*

    Below are the most commonly used constructors of the thread class :
    1) Thread()
    2) Thread(String name)
    3) Thread(Runnable r)
    4) Thread(Runnable r, String name)

 */

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int count = 1;
        while(count < 5)
        {
            System.out.println("hello PratS");
            count++;
        }
    }
}
public class CWH_ThreadConstructors {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Pratyush");
        t1.start();
        System.out.println("The ID of the thread is : " + t1.getId());
        System.out.println("The name of the thread is : " + t1.getName());
    }
}
