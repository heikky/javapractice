package Practice5_6.Furniture;
import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public int numbProduct;
    public int amountOfMoney;

    public static void showCommand(){
        System.out.print("Показать каталог - 1" + "\n" +  "Добавить в корзину - 2" + "\n" + "Убрать из корзины - 3" + "\n" +
                "Показать корзину - 4" + "\n" + "Купить товары из корзины - 5" + "\n" + "Показать список команд - 6" + "\n" + "Уйти - 7"
                + "\n" + "Ваша команда: ");
    }

    public static void main(String[] args){
        ArrayList<Furniture> basket=new ArrayList<Furniture>();

        Sofa sofa_1 = new Sofa("Skin", 48000, "Svensta", "Black", "Standart");
        Wardrobe wardrobe_1 = new Wardrobe("Wood", 30000, "Brimnes", "White", "Big");
        Chair chair_1 = new Chair("Wood", 5000, "Stefan", "Browm", "Small");

        ArrayList<Furniture> catalog = new ArrayList<Furniture>();
        catalog.add(sofa_1);
        catalog.add(wardrobe_1);
        catalog.add(chair_1);

        System.out.print("Введите сумму денег: ");
        Scanner in = new Scanner (System.in);
        int amountOfMoney = in.nextInt();

        Loader.showCommand();

        while(true){
            int command = in.nextInt();
            if(command == 1){ //вывод каталога
                FurnitureShop.printCatalog(catalog);
            }
            else if(command == 2){ //добавить в корзину
                System.out.print("Введите номер товара который хотите добавить в корзину: ");
                int numbProduct = in.nextInt()-1;
                FurnitureShop.getBasket(catalog, basket, numbProduct);
            }
            else if(command == 3){ //убрать из корзины
                System.out.println("Введите номер товара который хотите убрать из корзины: ");
                int numbProduct = in.nextInt()-1;
                FurnitureShop.delBasket(basket, numbProduct);
            }
            else if(command == 4){
                FurnitureShop.showBasket(basket);
            }
            else if(command == 5){ //покупка
                System.out.println("Стоимость всех товаров из Вашей корзины составляет: " + FurnitureShop.getSum());
                FurnitureShop.buy(amountOfMoney, basket);
            }
            else if(command == 6){ //вывод списка команд
                Loader.showCommand();
            }
            else if(command == 7){ //выход
                System.out.println("Выход");
                break;
            }
            else{
                System.out.print("Вы неверно ввели команду. Список команд: ");
                Loader.showCommand();
            }
        }
    }
}
