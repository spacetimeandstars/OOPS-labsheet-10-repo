package labsheet10.question04;

import java.util.TreeSet;

public class Question04TreeSetProducts {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();
        products.add(new Product("Keyboard", 800));
        products.add(new Product("Mouse", 400));
        products.add(new Product("Monitor", 7000));
        products.add(new Product("Pen Drive", 600));
        products.add(new Product("Headphones", 1200));

        for (Product product : products) {
            product.display();
        }
    }
}
