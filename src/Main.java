import java.util.ArrayList;

public class Catalog {

    private List<Products> products;

    public Catalog() {
        products = new ArrayList<>();
    }

    //Lägga till en produkt
    public void addProduct(Product product) {
        products.add(product);
    }

    //Visa alla produkter
    public void showAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    //Testar Catalog klass
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        //Skapar och lägger till två produkter
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Iphone", 699.99);

        catalog.addProduct(product1);
        catalog.addProduct(product2);

        //Visa alla produkter
        catalog.showAllProducts();
    }

}