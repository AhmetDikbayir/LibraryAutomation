package library;

import java.util.Scanner;

public class BookService {

    Scanner scan = new Scanner(System.in);

    public Book createBook(){
        System.out.println("Please enter the book name : ");
        String bookName = scan.nextLine();
        System.out.println("Please enter the writer name : ");
        String writerName = scan.nextLine();
        System.out.println("Please enter the book year of publication : ");
        int year = scan.nextInt();
        System.out.println();
        System.out.println("Please enter the book's page number : ");
        int pages = scan.nextInt();
        System.out.println();
        Book book = new Book(bookName, writerName, year, pages);
        DataBank.bookList.add(book);
        scan.close();
        return book;

    }

    public void listBook(){
        DataBank.bookList.stream().forEach(System.out::print);
    }


}
