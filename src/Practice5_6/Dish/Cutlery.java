package Practice5_6.Dish;

public class Cutlery extends Dish{
    private String type;

    public Cutlery(String colour, String material, int age) {
        super(colour, material, age);
    }

    @Override
    public String displayInfo() {
        return ("Материал: " + getMaterial() + "\n" + "Цвет: " + getColour() + "\n" + "Возраст: " + getAge() + "\n" + "Тип прибора: " + getType());
    }

    public String getType(){return type;}
    public void setType(String type){this.type=type;}
}
