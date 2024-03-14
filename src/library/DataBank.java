package library;

import java.util.ArrayList;

public class DataBank {

    static ArrayList<Book> bookList = new ArrayList<>();
    static ArrayList<User> userList = new ArrayList<>();

    static {
        Book book1 = new Book("Harry Potter Felsefe Taşı", "J. K. Rowling", 2013, 245, "Sci-Fi");
        Book book2 = new Book("Yüzüklerin Efendisi", "J. R. R: Tolkien", 2007, 456, "Sci-Fi");
        Book book3 = new Book("Doğu ekspresi cinayeti", "Agatha Christie", 2008, 450, "Adventure");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        ArrayList<Book> bookList1 = new ArrayList<>();
        bookList1.add(book1);

        User user1 = new User("Ahmet", "Han", "a.han@gmail.com", "5456960914",bookList1);
        User user2 = new User("Ali", "Can", "a.can@gmail.com", "5459996600");

        userList.add(user1);
        userList.add(user2);


    }
}
