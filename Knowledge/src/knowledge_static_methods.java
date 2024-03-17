class Student{
    static int count = 0;
    public Student(){
        count++;
        System.out.println("Student Number - " + count);
    }
}

public class knowledge_static_methods {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // For static methods or static variables, it's not required to create an object of the class to access those functions or variables. It can be accessed via "className.method" or "className.variableName". This is one of the reasons why Java is not a purely object-oriented programming language. In purely object-oriented language, all methods would be instance methods, meaning they would be associated with objects.
        System.out.println(Student.count);


        // String Handling: In Java, strings are objects, but string literals are treated differently. String literals can be used without explicitly creating objects, and some string operations are implemented as special cases. In a purely object-oriented language, all strings would be objects without any special cases.
        String str = new String("Hello World");   // string objects
        String str1 = "Hello World";                     //  string literals

    }
}
