package Practice5_6.Dish;

public abstract class Dish {
    private String colour;
    private String material;
    private int age;

    public Dish(String colour, String material, int age){
        this.age=age;
        this.colour=colour;
        this.material=material;
    }

    public String getColour(){return colour;}
    public String getMaterial(){return material;}
    public int getAge(){return age;}

    public abstract String displayInfo();
}

