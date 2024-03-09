package library;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class LibraryRunner {
    public static void main(String[] args) {


        Library library = new Library();
        BookService bookService = new BookService();
        UserService userService = new UserService();


        //library.book1.setBookName("Denizler Altında 20Bin Fersah");
        library.book.setBookName(DataBank.bookList.get(0).getBookName());




        bookService.createBook("Atomik Alışkanlıklar", "James Clear", 2023, 356);

        System.out.println("--------------DataBank deki kitaplar------------");
        for(Book book : DataBank.bookList){
            System.out.println(book.getBookName());
        }
        System.out.println("------------------------");

        System.out.println("--------------DataBank deki Userlar------------");
        for(User user : DataBank.userList){
            System.out.println(user.getName());
        }
        System.out.println("------------------------");




        //UserService userService1 = new UserService(new User("Ahmet", "Dikbayir", "a.dikbayir@gmail.com", "05456960914"));


        System.out.println("--------FIRST----------");
        //System.out.println(userService.getUser());
        //System.out.println(userService1.getUser());
        System.out.println("------------------");


        //userService.borrowBook(book2);
        //userService1.borrowBook(book1);

        System.out.println("--------SECOND----------");
        //System.out.println(userService.getUser());
        //System.out.println(userService1.getUser());
        System.out.println("------------------");
        //userService.giveBackBook(book2);
        //userService1.giveBackBook(book1);

        System.out.println("--------THIRD----------");
        //System.out.println(userService.getUser());
        //System.out.println(userService1.getUser());

        System.out.println("--------FOURTH----------");
        User user3 = userService.createUser("Veli", "Han", "ali@mail.com", "5456669900");

        for(User user : DataBank.userList){
            System.out.println(user.getName());
        }
        //userService.giveBackBook(book3);
        //System.out.println(user2);
        //System.out.println(userService.getUser());
    }
}
