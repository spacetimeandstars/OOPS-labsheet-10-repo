package labsheet10.question03;

import java.util.HashSet;

public class Question03HashSetBooks {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book(1, "Java Basics", "James"));
        books.add(new Book(2, "OOP Concepts", "Thomas"));
        books.add(new Book(1, "Duplicate Java", "Other Author"));

        System.out.println("Book count: " + books.size());
        for (Book book : books) {
            book.display();
        }
    }
}
