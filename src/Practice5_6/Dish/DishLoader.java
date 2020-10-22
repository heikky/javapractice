package Practice5_6.Dish;

public class DishLoader {
    public static void main(String[]args){
        Cup cup1 = new Cup("Белый", "Керамика", 6);
        cup1.setHandle("Есть");
        System.out.println(cup1.displayInfo() + "\n");
        Cutlery spoon = new Cutlery("Металлический", "Серебро", 17);
        spoon.setType("Ложка");
        System.out.println(spoon.displayInfo() + "\n");
        Plate plate1 = new Plate("Белый", "Пластик", 1);
        System.out.println(plate1.displayInfo() + "\n");
    }
}
