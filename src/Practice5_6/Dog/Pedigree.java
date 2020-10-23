package Practice5_6.Dog;

public class Pedigree extends Dog{
    private int cost;

    public Pedigree(int age, String sex, String breed){super (age, sex, breed);}

    @Override
    public String displayInfo() {
        return ("Возраст: " + getAge() + "\n" + "Пол: " + getSex() + "\n" + "Порода: " + getBreed() + "\n" + "Цена: " + getCost() + "\n");
    }

    public int getCost(){return cost;}
    public void setCost(int cost){this.cost=cost;}
}
