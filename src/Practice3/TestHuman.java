package Practice3;

public class TestHuman {
    public static void main(String[]args){
        Human human = new Human();
        Human.Head h = new Human.Head();
        h.setEyeColour("Green");
        h.setHairColour("Black");
        Human.Hand hand = new Human.Hand();
        hand.setPalmSize(12);
        Human.Leg l = new Human.Leg();
        l.setFootSize(45);
        System.out.println("Цвет глаз: " + h.getEyeColour() + "\n" + "Цвет волос: " + h.getHairColour()+ "\n" + "Размер ладони: " + hand.getPalmSize() + "\n" + "Размер обуви: " + l.getFootSize());
    }
}
