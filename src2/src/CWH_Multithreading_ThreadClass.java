/*
    Question -> why for the thread class, we only need to create an object and for the runnable interface, we have to
    first create an object and then by passing that particular object,  we create a thread.
    Thread class java code ->
    Thread1 obj1 = new Thread1();
    obj1.start();

    Runnable interface java code ->
    Thread3 obj3 = new Thread3();
            Thread t1 = new Thread(obj3);

    Answer -> In java, there are two main ways to create and start threads : by extending the "Thread" class or by implementing the "Runnable" interface. Both approaches ultimately involve creating an object, but they have different ways of achieving multithreading.

    EXTENDING THE THREAD CLASS -
    When you extend the "thread" class, your class becomes a thread itself by inheriting the "thread" class. You override the "run" method to define the code that the thread will execute.

    IMPLEMENTING THE RUNNABLE INTERFACE -
    When you implement the "Runnable" interface, your class is not inherently a thread. Instead, it provides a "run" method that contains the code to be executed in the new thread. You need to create an instance of your class and then pass it to the "thread" constructor to associate it with a thread.
 */


class Thread1 extends Thread{
    public void run(){
        int count = 0;
        while(count < 1000000){
            System.out.println("Thread 1 is running");
            System.out.println("I am a good boy");
            count++;
        }
    }
}

class Thread2 extends Thread{
    public void run() {
        int count = 0;
        while(count < 1000000){
            System.out.println("Thread 2 is running");
            System.out.println("I am a bad boy");
            count++;
        }
    }
}

public class CWH_Multithreading_ThreadClass{
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        obj2.start();
    }
}