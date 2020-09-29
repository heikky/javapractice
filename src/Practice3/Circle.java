package Practice3;

public class Circle {
    public double radius;
    public String colour;

    public Circle(){
        radius=1.0;
        colour="black";
    }

    public Circle(double r, String colour){
        this.radius=r;
        this.colour=colour;
    }

    public double getRadius() {
        return radius;
    }
    public String getColour() {
        return colour;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
