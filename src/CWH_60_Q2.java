class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

public class CWH_60_Q2 {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
    }
}
