package library;

import java.util.Iterator;
import java.util.Scanner;

public class UserService {

    Scanner scan = new Scanner(System.in);

    public User createUser(){
        System.out.println("Please enter the member name : ");
        String name = scan.nextLine();
        System.out.println("Please enter the member lastname : ");
        String lastName = scan.nextLine();
        System.out.println("Please enter the member email address : ");
        String email = scan.next();
        System.out.println("Please enter the member's phone number : ");
        String user_tel = scan.next();
        System.out.println("User successfully added!!");
        User user = new User(name, lastName, email, user_tel);
        DataBank.userList.add(user);
        return user;
    }

    public void listUser(){
        DataBank.userList.stream().forEach(System.out::print);
    }

    public void borrowBook(){
        //System.out.println();
        System.out.println("Please enter the user Email : ");
        String userEmail = scan.nextLine();
        System.out.println("Please enter a bookname : ");
        String bookName = scan.nextLine();

        for(User user : DataBank.userList){
            for(Book book : DataBank.bookList){
                if(user.getEmail().equals(userEmail) && book.getBookName().equalsIgnoreCase(bookName)){
                    user.setBookList(book);
                }
            }
        }

    }
}
