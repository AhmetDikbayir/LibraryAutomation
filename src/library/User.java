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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }
}
