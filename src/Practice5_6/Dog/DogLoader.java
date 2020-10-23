package Practice5_6.Dog;

public class DogLoader {
    public static void main(String[] args) {
        Shelter dog1 = new Shelter(12, "М", "Дворняжка");
        dog1.setHealth("Плохое");
        System.out.println(dog1.displayInfo() + "\n");
        Pedigree dog2 = new Pedigree(3, "Ж", "Пудель");
        dog2.setCost(12000);
        System.out.println(dog2.displayInfo() + "\n");
    }
}