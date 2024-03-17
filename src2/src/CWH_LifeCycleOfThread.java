/*
                                   --> Non-runnable(blocked) [ in case of i/o ]  --> Runnable ... and the loop goes on till the job is completed.
    New --> Runnable --> Running
                                   --> Terminated ( if the job is done )


    1) New - Instance of thread created which has not yet started by invoking start().
    2) Runnable - After invocation of start() and before it is selected to be
                  run by the scheduler.
    3) Running - After thread scheduler has selected it.
    4) Non-runnable - Thread alive, not eligible to run.
    5) Terminated - run() method has exited.
 */

public class CWH_LifeCycleOfThread {
    public static void main(String[] args) {

    }
}
