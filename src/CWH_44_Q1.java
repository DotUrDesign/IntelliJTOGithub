/*
    1) Create a class "Cylinder" and use getters and setters to set its radius and height.
    2) Use (1) to calculate surface area and volume of the cylinder.
    3) Use a constructor and repeat (1).
    4) Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
    5) Repeat (1) for a sphere.
 */

class Cylinder{
    double radius;
    double height;
    public double volume(){
        double r = radius;
        double h = height;
        return (Math.PI * r * r * h);
    }
    public double surfaceArea(){
        double r = radius;
        double h = height;
        return ((2*Math.PI*r*r) + (2*Math.PI*r*h));
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setHeight(double height){
        this.height = height;
    }
}

public class CWH_44_Q1 {
    public static void main(String[] args) {
        Cylinder c  = new Cylinder();
        c.setRadius(3.0);
        c.setHeight(4.0);
        System.out.println(c.volume());
        System.out.println(c.surfaceArea());
    }
}
