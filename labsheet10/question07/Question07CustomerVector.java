package labsheet10.question07;

import java.util.Vector;

public class Question07CustomerVector {
    public static void main(String[] args) {
        Vector<Customer> customers = new Vector<>();

        Customer first = new Customer();
        first.setId(1);
        first.setName("Aarav");
        first.setEmail("aarav@example.com");
        customers.add(first);

        Customer second = new Customer();
        second.setId(2);
        second.setName("Neha");
        second.setEmail("neha@example.com");
        customers.add(second);

        for (Customer customer : customers) {
            customer.display();
        }
    }
}
