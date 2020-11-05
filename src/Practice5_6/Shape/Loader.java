package Practice5_6.Shape;

public class Loader {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(7, "Black", true);
        circle_1.setRadius(14.5);
        circle_1.setColor("White");
        System.out.println("Радиус круга: " + circle_1.getRadius() + "; Цвет круга: " + circle_1.getColor());
        System.out.println("\n" + "Площадь круга: " + circle_1.getArea() + "; Периметр круга: " + circle_1.getPerimeter());
        System.out.println(circle_1.toString());

        Rectangle rectangle_1 = new Rectangle(9.5, 12.2);
        rectangle_1.setLength(9.5);
        rectangle_1.setWidth(12.2);
        System.out.println("Длина прямоугольника: " + rectangle_1.getLength() + "; Ширина прямоугольника: " + rectangle_1.getWidth());
        System.out.println("\n" + "Площадь прямоугольника: " + rectangle_1.getArea() + "; Периметр прямоугольника: " + rectangle_1.getPerimeter() + "\n");
        System.out.println(rectangle_1.toString());

        Square square_1 = new Square(8.3);
        System.out.println("\n" + square_1.toString());
    }
}
