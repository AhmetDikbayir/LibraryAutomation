package library;

public class BookService {

    public Book createBook(String bookName, String writerName, Integer year, Integer pages){
        Book book = new Book(bookName, writerName, year, pages);
        DataBank.bookList.add(book);
        return book;
    }
}
