class Circle69{
    int radius;
    public Circle69(int radius){
        this.radius = radius;
        System.out.println("Parameterised constructor of radius = " + radius);
    }

    public double area(){
        return (Math.PI * radius * radius);
    }
}

class Cylinder69 extends Circle{
    int height;
    Cylinder69(int radius, int height){
        super(radius);
        System.out.println("Radius is fetched from the super class. Parameterised constructor!!");
        this.height = height;
    }

    public double volume(){
        return (Math.PI * radius * radius * height);
    }
    @Override
    public double area(){
        return (Math.PI * radius * radius + 2 * Math.PI * radius * height);
    }
}

public class test1 {
    public static void main(String args[]){
        Cylinder69 cyl = new Cylinder69(2, 3);
        System.out.println(cyl.volume());
        System.out.println(cyl.area());
    }
}
