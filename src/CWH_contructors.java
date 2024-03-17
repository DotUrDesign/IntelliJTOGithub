class SuperHero{
    String power;
    char grade;
    SuperHero(){
        power = "Fire";
        grade = 'A';
    }
    SuperHero(char grade){
        this.grade = grade;
        power = "Speed";
    }
    SuperHero(char grade, String power){
        this.grade = grade;
        this.power = power;
    }
    public void printDetails(){
        System.out.println("Grade : " + grade);
        System.out.println("Power : " + power);
    }
}

public class CWH_contructors {
    public static void main(String[] args) {
        SuperHero sp = new SuperHero();
        SuperHero sp1 = new SuperHero('X');
        SuperHero sp2 = new SuperHero('X', "Water");

        sp.printDetails();
        sp1.printDetails();
        sp2.printDetails();
    }
}
