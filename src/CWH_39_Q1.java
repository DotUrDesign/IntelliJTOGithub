class Employee2 {
    int salary;
    String name;
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

}

public class CWH_39_Q1 {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        e1.setName("Pratyush");
        e1.setSalary(30);
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
    }
}
