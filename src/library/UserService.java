package library;

import java.util.ArrayList;

public class UserService {

    public User createUser(String name, String lastName, String email, String user_tel){
        User user = new User(name, lastName, email, user_tel);
        DataBank.userList.add(user);
        return user;
    }

    public void listUser(){
        DataBank.userList.stream().forEach(System.out::print);
    }
}
