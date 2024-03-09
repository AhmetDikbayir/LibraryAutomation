package library;

import javax.xml.crypto.Data;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();
        library.book1.setBookName("Denizler Altında 20Bin Fersah");
        System.out.println(library.book1.getBookName());


        Book book1 = new Book("Denizler Altında 20Bin Fersah", "Jules Verne", 2012, 256);

        Book book2 = new Book();
        book2.setBookName(DataBank.bookName.get(0));
        System.out.println(book2.getBookName());

        Book book3 = new Book("Doğu ekspresi cinayeti", "Agatha Christie", 2008, 450);

        UserService userService = new UserService();

        UserService userService1 = new UserService(new User("Ahmet", "Dikbayir", "a.dikbayir@gmail.com", "05456960914"));


        System.out.println("--------FIRST----------");
        System.out.println(userService.getUser());
        System.out.println(userService1.getUser());
        System.out.println("------------------");


        userService.borrowBook(book2);
        userService1.borrowBook(book1);

        System.out.println("--------SECOND----------");
        System.out.println(userService.getUser());
        System.out.println(userService1.getUser());
        System.out.println("------------------");
        userService.giveBackBook(book2);
        userService1.giveBackBook(book1);

        System.out.println("--------THIRD----------");
        System.out.println(userService.getUser());
        System.out.println(userService1.getUser());

        System.out.println("--------FOURTH----------");
        User user2 = userService1.createUser("Ali", "Han", "ali@mail.com", "5456669900");

        userService1.borrowBook(book3);
        userService1.borrowBook(book2);

        //userService1.giveBackBook(book3);
        System.out.println(user2);
        System.out.println(userService1.getUser());
    }
}
