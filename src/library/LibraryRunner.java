package library;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class LibraryRunner {
    public static void main(String[] args) {


        Library library = new Library();
        BookService bookService = new BookService();
        UserService userService = new UserService();


        //library.book1.setBookName("Denizler Altında 20Bin Fersah");
        //library.book.setBookName(DataBank.bookList.get(0).getBookName());




        bookService.createBook("Atomik Alışkanlıklar", "James Clear", 2023, 356);


        System.out.println("--------FIRST----------");
        System.out.println("--------------DataBank deki kitaplar------------");
        //bookService.listBook();
        System.out.println("------------------------");


        System.out.println("--------SECOND----------");
        System.out.println("--------------DataBank deki Userlar------------");
        userService.borrowBook();
        System.out.println("------------------------");

        System.out.println("--------THIRD----------");

        System.out.println("------------------------");

        System.out.println("--------FOURTH----------");
       // User user3 = userService.createUser("Veli", "Han", "ali@mail.com", "5456669900");
        //userService.listUser();

        System.out.println(DataBank.userList.get(0));

        //a.han@gmail.com
        //Please enter a bookname :
        //Atomik Alışkanlıklar

    }
}
