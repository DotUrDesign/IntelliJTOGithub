interface Shape{
    void draw();
}

interface Colorable{
    void setColor(String color);
    String getColor();
}

class Drawing implements Shape, Colorable{
    public void draw(){
        System.out.println("Drawing...!");
    }
    public void setColor(String color){
        System.out.println("The dominating color in the drawing is : " + color);
    }
    public String getColor(){
        return "Blue";
    }
    public void sample(){
        System.out.println("Sample function!");
    }
}

public class CWH_polymorphism {
    public static void main(String[] args) {
        // In case we create an object of the class "Drawing" and referencing to the interface "Colorable", then that object will only be able to access the overridden methods or the methods declared in "Colorable" interface. But, it won't be able to access the "Drawing" class methods or any other interface's methods. And this is how, polymorphism works in JAVA.
        Colorable c = new Drawing();
        c.setColor("Red");
        c.getColor();
        // c.draw();   --> throws error. Not accessible.
        // c.sample();  --> throws error. Not accessible.
    }
}
