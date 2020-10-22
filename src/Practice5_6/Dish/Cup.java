package Practice5_6.Dish;

public class Cup extends Dish{
    private String handle;

    public Cup(String colour, String material, int age) {
        super(colour, material, age);
    }

    @Override
    public String displayInfo() {
        return ("Материал: " + getMaterial() + "\n" + "Цвет: " + getColour() + "\n" + "Возраст: " + getAge() + "\n" + "Наличие ручки: " + getHandle());
    }

    public String getHandle(){return handle;}
    public void setHandle(String handle){this.handle=handle;}
}
