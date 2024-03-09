package library;

import java.util.ArrayList;

public class UserService {

    private User user = new User();

    public UserService() {
    }

//    public UserService(User user) {
//        this.user = user;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void borrowBook(Book book){
        ArrayList<Book> bookList1 = null;
        bookList1.add(book);
        user.setBookList(bookList1);
    }

    public void giveBackBook(Book book, User user){


    }

    public User createUser(String name, String lastName, String email, String user_tel){
        User user = new User(name, lastName, email, user_tel);
        return user;
    }
}
