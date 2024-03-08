package library;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String user_tel;

    public User() {
    }

    public User(String name, String lastName, String email, String user_tel) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.user_tel = user_tel;
    }
}
