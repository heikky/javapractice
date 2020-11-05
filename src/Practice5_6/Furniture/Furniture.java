package Practice5_6.Furniture;

public abstract class Furniture {
    private String material;
    private int price;
    private String name;
    private String colour;
    private String dimensions;

    Furniture(String material, int price, String name, String colour, String dimensions) {
        this.material = material;
        this.price = price;
        this.name = name;
        this.colour = colour;
        this.dimensions = dimensions;
    }

    public abstract String displayInfo();
    public void setMaterial(String material){this.material=material;}
    public void setPrice(int price){this.price=price;}
    public void setName(String name){this.name=name;}
    public void setColour(String Colour){this.colour=colour;}
    public void setDimensions(String dimensions){this.dimensions=dimensions;}
    public String getMaterial(){return material;}
    public int getPrice(){return price;}
    public String getName(){return name;}
    public String getColour(){return colour;}
    public String getDimensions(){return dimensions;}

}

class Sofa extends Furniture{
    private int capacity; //сколько людей помещается

    Sofa(String material, int price, String name, String colour, String dimensions){
        super(material, price, name, colour, dimensions);
    }

    public void setCapacity(int capacity){this.capacity=capacity;}
    public int getCapacity(){return capacity;}

    @Override
    public String displayInfo() {
        return ("Материал: " + getMaterial() + "; Цвет: " + getColour() + "; Габариты: " + getDimensions() + "; Вместимость(человек): " + getCapacity());
    }
}

class Wardrobe extends Furniture{
    private double height;
    private double length;
    private double width;

    Wardrobe(String material, int price, String name, String colour, String dimensions){
        super(material, price, name, colour, dimensions);
    }

    public void setHeight(double height){this.height=height;}
    public void setLength(double length){this.length=length;}
    public void setWidth(double width){this.width=width;}
    public double getHeight(){return height;}
    public double getLength(){return length;}
    public double getWidth(){return width;}

    @Override
    public String displayInfo() {
        return ("Материал: " + getMaterial() + "; Цвет: " + getColour() + "; Габариты: " + getDimensions() +
                "; Высота: " + getHeight() + "; Длина: " + getLength() + "; Ширина: " + getWidth());
    }
}

class Chair extends Furniture{
    private double backHeight; //высота спинки
    private double legLength; //длина ножки

    Chair(String material, int price, String name, String colour, String dimensions){
        super(material, price, name, colour,dimensions);
    }

    public void setBackHeight(double backHeight) { this.backHeight = backHeight; }
    public void setLegLength(double legLength) { this.legLength = legLength; }
    public double getBackHeight() { return backHeight; }
    public double getLegLength() { return legLength; }

    @Override
    public String displayInfo() {
        return ("Материал: " + getMaterial() + "; Цвет: " + getColour() + "; Габариты: " + getDimensions() +
                "; Высота спинки: " + getBackHeight() + "; Длина ножки: " + getLegLength());
    }
}