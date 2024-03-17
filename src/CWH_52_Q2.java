class Rectangle{
    int length, breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int area(){
        return (length*breadth);
    }
}

class Cuboid extends Rectangle{
    // don't initialize the variables "length" and "breadth" here, as they will be inherited from the superclass.
    int height;
    public Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }
    public int volume(){
        return (length*breadth*height);
    }
}

public class CWH_52_Q2 {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(2,3,4);
        System.out.println(c.volume());
    }
}
