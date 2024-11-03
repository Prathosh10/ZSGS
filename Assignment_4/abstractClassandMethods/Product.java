import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    private String name;
    private String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public abstract double getPrice();
    public abstract void getDescription();

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }
}

class ElectronicProduct extends Product{
    private double price;
    private float GST;
    private String brand;

    public ElectronicProduct(String name, double price, String brand) {
        super(name,  "Electronic");
        this.price = price ;
        this.GST = 2;
        this.brand = brand;
    }
    @Override
    public double getPrice() {
        return price + ((GST / 100) * price);
    }

    @Override
    public void getDescription() {
        System.out.println("Name : " + super.getName() + "\n" +
                            "Category : " + super.getCategory() + "\n" +
                             "Brand : " + this.brand + "\n" +
                            "Price : " + (int)this.getPrice());
    }
}

class ClothingProduct extends Product{
    private double price;
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name,  "Clothing");
        this.price = price ;
        this.size = size;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void getDescription() {
        System.out.println("Name : " + super.getName() + "\n" +
                "Category : " + super.getCategory() + "\n" +
                "Size : " + this.size + "\n" +
                "Price : " + (int)this.getPrice());
    }
}
//
class BookProduct extends Product{
    private String author;
    private double price;

    public BookProduct(String name, double price, String author) {
        super(name, "Stationary & Books");
        this.price = price;
        this.author = author;
    }
    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void getDescription() {
        System.out.println("Name : " + super.getName() + "\n" +
                "Category : " + super.getCategory() + "\n" +
                "Author : " + this.author + "\n" +
                "Price : " + (int)this.getPrice());
    }
}

class ShoppingCart {
    private List<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public boolean addProduct(Product thing) {
        cart.add(thing);
        return true;
    }

    public void getTotalPrice() {
        double totalPrice = 0;

        for (Product thing : cart) {
            totalPrice += thing.getPrice();
        }
        System.out.println("Total price : " + (int)totalPrice);
    }

    public void getDetails() {
        for (Product thing : cart) {
            System.out.println("------------------");
            thing.getDescription();
        }
        System.out.println("------------------");
    }
}


class productDemo {
    public static void main(String[] args) {
        ShoppingCart buy = new ShoppingCart();
        buy.addProduct(new ElectronicProduct("Bould Wireless", 1000, "Bould"));
        buy.addProduct(new ClothingProduct("Puma t-shirt", 499, "M"));
        buy.addProduct(new BookProduct("the power of subconcious Mind", 300, "Joseph Murphy"));

        buy.getDetails();
        buy.getTotalPrice();
    }
}

