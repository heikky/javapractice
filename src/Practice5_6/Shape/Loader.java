package Practice5_6.Shape;

public class Loader {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(5, "Black", true);
        circle_1.setRadius(6.5);
        circle_1.setColor("White");
        System.out.println("Радиус круга: " + circle_1.getRadius() + "; Цвет круга: " + circle_1.getColor());
        System.out.println("\n" + "Площадь круга: " + circle_1.getArea() + "; Периметр круга: " + circle_1.getPerimeter());
        System.out.println(circle_1.toString());

        Rectangle rectangle_1 = new Rectangle(7.5, 11.2);
        rectangle_1.setLength(7.5);
        rectangle_1.setWidth(11.2);
        System.out.println("Длина прямоугольника: " + rectangle_1.getLength() + "; Ширина прямоугольника: " + rectangle_1.getWidth());
        System.out.println("\n" + "Площадь прямоугольника: " + rectangle_1.getArea() + "; Периметр прямоугольника: " + rectangle_1.getPerimeter() + "\n");
        System.out.println(rectangle_1.toString());

        Square square_1 = new Square(4.6);
        System.out.println("\n" + square_1.toString());
    }
}
