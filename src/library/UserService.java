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
        System.out.println("Please enter the useremail : ");
        String userEmail = scan.nextLine();
        System.out.println("Please enter a bookname : ");
        String bookName = scan.nextLine();

        Iterator<Book> bookIterator = DataBank.bookList.iterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                System.out.println("Book found");
                Iterator<User> userIterator = DataBank.userList.iterator();
                while (userIterator.hasNext()) {
                    User user = userIterator.next();
                    if (user.getEmail().equalsIgnoreCase(userEmail)) {
                        user.setBookList(book);
                        break;
                    }else {
                        System.out.println("");
                    }
                }
                break;
            }
        }
        scan.close();
    }
}
