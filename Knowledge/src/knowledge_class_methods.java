class Student2{
    int count = 0;
    Student2(){
        count++;
        System.out.println("Student number - " + count);
    }
}

public class knowledge_class_methods {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        Student2 s3 = new Student2();

    }
}
