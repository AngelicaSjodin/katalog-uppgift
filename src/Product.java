public class Product {
    //attributerna
    private String name;
    private int price;

    //konstruktorn
    public Product(String name,int price) {
        this.name = name;
        this.price = price;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

    //toString yippi
    public String showProducts(){
        return "Produkt: " + name + " - " + price+"kr";

    }


}
