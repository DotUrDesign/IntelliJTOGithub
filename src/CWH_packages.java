/*

    Interpreter  vs Compiler
    Interpreter translates one statement at a time into machine code.
    Compiler scans the entire program and translates whole of it into machine code.

     Interpreter                              Compiler
     - One statement at a time                - Entire program at a time
     - Interpreter is needed everytime        - Once compiled, it is not needed
     - Partial execution if error             - No execution if an error occurs
     - Easy for programmers                   - Usually not as easy as                                                      interpreter ones.

     Is Java compiled or Interpreted ?
     Java is a hybrid language -> both compiled and interpreted language.

     WHY JAVA IS OFTEN REFERRED TO AS PLATFORM INDEPENDENT LANGUAGE ?
     *** IMPLEMENT THIS PROCESS IN VS CODE ***
     Java file(pratyush.java) --> After compiling using javac [ Class file is created ] ( pratyush.class ) --> bytecode   --> can be used by java interpreter.

     -> A JVM(Java Virtual Machine) can be used to interpret this bytecode.
     -> This bytecode can be taken to any platform (Windows, Mac, Linux) for execution.
     -> Hence, Java is platform independent ( write once run everywhere ).

    EXECUTING A JAVA PROGRAM -
    javac pratyush.java  -> compiled
    java pratyush        -> Interpreted

    PACKAGES -
    A package is used to group related classes. Packages help in avoiding name conflicts. There are two types of packages:
    1) Built-in package  -> Java API
    2) User defined package  -> Custom packages

 */

public class CWH_packages {
    public static void main(String[] args) {

    }
}
