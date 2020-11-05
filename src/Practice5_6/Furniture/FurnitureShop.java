package Practice5_6.Furniture;
import java.util.ArrayList;

public class FurnitureShop {
    private String storeName;
    private String buyersName;
    static int sum = 0;
    static int count = 0;

    FurnitureShop(String storeName, String buyersName){
        this.storeName=storeName;
        this.buyersName=buyersName;
    }

    static void printCatalog(ArrayList<Furniture> catalog){
        System.out.println("каталог: ");
        for(int i=0; i<catalog.size(); i++){
            System.out.println(i+1 +") " + catalog.get(i).getName() + " " + catalog.get(i).getPrice());
        }
    }

    static void getBasket(ArrayList<Furniture> catalog, ArrayList<Furniture> basket, int numbProduct){
        basket.add(catalog.get(numbProduct));
        System.out.println("Товар " + basket.get(count).getName() + " добавлен в корзину!");
        sum += basket.get(count).getPrice();
        ++count;
    }

    static void delBasket(ArrayList<Furniture> basket, int numbProduct){
        if (!basket.isEmpty()){
            System.out.println("Товар " + basket.get(numbProduct).getName() + " удалён из корзины!");
            sum -= basket.get(numbProduct).getPrice();
            basket.remove(numbProduct);
            --count;
        }
        else {
            System.out.println("Корзина пуста");;
        }
    }

    static void showBasket(ArrayList<Furniture> basket){
        System.out.println("Корзина: ");
        if(basket.isEmpty()){
            System.out.println("Пуста");;
        }
        else {
            for (int i = 0; i < basket.size(); i++) {
                System.out.println(i + 1 + ")" + basket.get(i).getName() + " " + basket.get(i).getPrice());
            }
        }
    }

    static void buy(int amountOfMoney, ArrayList<Furniture> basket){
        if (amountOfMoney >= sum) {
            amountOfMoney -= sum;
            basket.clear();
            System.out.println("Вы успешно купили товар!" + " Остаток средств: " + amountOfMoney);
        }
        else{
            System.out.println("Недостаточно средств");
        }
    }

    static int getSum(){return sum;}
    public void setBuyersName(String buyersName) { this.buyersName = buyersName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }
    public String getBuyersName() { return buyersName; }
    public String getStoreName() { return storeName; }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "storeName='" + storeName + '\'' +
                ", buyersName='" + buyersName + '\'' +
                '}';
    }
}
