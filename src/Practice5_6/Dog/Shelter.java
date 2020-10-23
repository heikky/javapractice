package Practice5_6.Dog;

public class Shelter extends Dog{
    private String health;

    public Shelter(int age, String sex, String breed){super (age, sex, breed);}

    @Override
    public String displayInfo() {
        return ("Возраст: " + getAge() + "\n" + "Пол: " + getSex() + "\n" + "Порода: " + getBreed() + "\n" + "Состояние здоровья: " + getHealth() + "\n");
    }

    public String getHealth(){return health;}
    public void setHealth(String health){this.health=health;}
}
