/*

    MULTITHREADING IN JAVA -
    Multiprocessing and Multithreading both are used to achieve multitasking.
    Let's first understand the terms - multiprocessing, multithreading and multitasking.

    Multiprocessing - Involves the execution of multiple processes simultaneously, each with its own memory space. Processes run independently and may communicate via inter-process communication. Typically, used to leverage multiple CPU cores.

    Multithreading - Multithreading comes into picture when we need multitasking within a process. Involves the execution of multiple threads within a single process. Threads share the same memory space(memory consumption and resource allocation is less), but each has its own execution task. Suitable for tasks that can be parallelized within a single program.

    Multitasking - General term referring to the concurrent execution of multiple tasks or processes. It can encompass both multiprocessing(multiple processes) and multithreading(multiple threads within a process) depending on the context.

    Multithreading -> concurrency
    Multiprocessing -> parallelism

    Concurrency - It is a concept where multiple tasks are being executed, but it doesn't necessarily mean they are executing simultaneously.

    Parallelism - It is the simultaneous execution of multiple tasks, where each task is broken down into subtasks that are executed concurrently. It is about performing multiple operations simultaneously.

    Examples -
    Multithreading -> Web servers, worker.js implemented in node.js
    Multiprocessing -> Web scraping, file conversion, data aggregation, image processing.

    In a nut shell,
    1) threads use shared memory area.
    2) threads = faster context switching
    3) thread - light weight & process - heavy weight, as thread needs less resources and memory to operate.
     Example -> A word document can have one thread running in foreground as an editor and another in the background auto-saving the document.

     FLOW OF CONTROL IN JAVA -
     WITHOUT THREADING
     main() --> func1() --> func2() --> end
     Basically, if the func1 is waiting for the resources to be allocated or some I/O operations, then the func2 is bound to wait until the func1 completes its execution.

     WITH THREADING
     main()  --> func1()
             --> func2()
      basically, the func1 and func2 are being executed in different threads, and after being executed, these custom threads update the result in the main thread. In short, the expensive computation are being handled by the custom threads and after being executed, these threads return the value to the main thread via a promise, for which the main thread never gets blocked for any expensive operation.


      CREATING A THREAD IN JAVA -
       Two ways --> By extending the thread class
                --> By implementing the runnable interface
 */

public class CWH_multithreading {
    public static void main(String[] args) {

    }
}
