class Square{
    int side;
    public int getPerimeter(){
        return (side * 4);
    }
    public int getArea(){
        return (side * side);
    }
}

public class CWH_39_Q2 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());
    }
}
