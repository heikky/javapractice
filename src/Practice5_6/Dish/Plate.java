package Practice5_6.Dish;

public class Plate extends Dish {
    public Plate(String colour, String material, int age) {
        super(colour, material, age);
    }

    @Override
    public String displayInfo() {
        return ("Материал: " + getMaterial() + "\n" + "Цвет: " + getColour() + "\n" + "Возраст: " + getAge() + "\n");
    }
}
