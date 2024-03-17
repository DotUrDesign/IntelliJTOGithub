class Circle{
    int radius;
    public Circle(){
        System.out.println("I am non-parameterized constructor of Circle");
    }
    public Circle(int radius){
        this.radius = radius;
        System.out.println("I am parameterized constructor of Circle");
    }
    public double area(){
        return (Math.PI*radius*radius);
    }
}

class Cylinder1 extends Circle{
    int height;
    public Cylinder1(int radius, int height){
        super(radius);
        System.out.println("I am a parameterized constructor of Cylinder");
        this.height = height;
    }

    @Override
    public double area(){
        return (Math.PI*radius*radius + 2*Math.PI*radius*height);
    }
    public double volume(){
        return (Math.PI*radius*radius*height);
    }
}

public class CWH_52_Q1 {
    public static void main(String[] args) {
        Cylinder1 c = new Cylinder1(2,3);
        System.out.println(c.area());
        System.out.println(c.volume());

        Circle cir = new Circle(3);
        System.out.println(cir.area());
    }
}
