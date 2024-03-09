package library;

public class UserService {

    private User user = new User();

    public UserService() {
    }

    public UserService(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void borrowBook(Book book){
        user.setBook(book);
    }

    public void giveBackBook(Book book){

        if(book.getBookName().equalsIgnoreCase(user.getBook().getBookName())){
            user.setBook(null);
        }
    }

    public User createUser(String name, String lastName, String email, String user_tel){
        User user = new User(name, lastName, email, user_tel);
        return user;
    }
}
