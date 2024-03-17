class Employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class CWH_class {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 2;
        emp1.name = "prats";
        emp1.printDetails();

        Employee emp2 = new Employee();
        emp2.id = 3;
        emp2.name = "Harry";
        emp2.printDetails();
    }
}
