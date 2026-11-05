package labsheet10.question04;

public class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println(name + ": Rs. " + price);
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
}
