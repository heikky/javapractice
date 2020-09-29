package Practice3;

public class TestCircle {
    public static void main(String[]args){
        Circle c1=new Circle(3, "white");
        System.out.println("Radius is " + c1.getRadius() + " Color is " + c1.getColour()
                + " Area is " + c1.getArea() + " Perimeter is " + c1.getPerimeter());
    }
}
