package Practice5_6.Dog;

public abstract class Dog {
    private int age;
    private String sex;
    private String breed;

    public Dog(int age, String sex, String breed){
        this.age=age;
        this.sex=sex;
        this.breed=breed;
    }

    public String getBreed(){return breed;}
    public String getSex(){return sex;}
    public int getAge(){return age;}

    public abstract String displayInfo();
}
