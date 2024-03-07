package library;

import javax.xml.crypto.Data;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();
        library.book1.setBookName("Denizler Altında 20Bin Fersah");
        System.out.println(library.book1.getBookName());

        Book book2 = new Book();
        book2.setBookName(DataBank.bookName.get(0));
        System.out.println(book2.getBookName());


    }
}
