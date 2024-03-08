package library;

public class UserService {

    User user = new User();

    public void borrowBook(Book book){
        user.setBook(book);
    }
}
