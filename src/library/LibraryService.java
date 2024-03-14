package library;

import java.util.Scanner;

public class LibraryService {

    Scanner scan = new Scanner(System.in);

    public void entryMenu(){
        UserService userService = new UserService();
        BookService bookService = new BookService();
        int select =0;
        do{
            System.out.println("Welcome Ancient Magnificient Library");
            System.out.println("Select what do you want to do?\n" +
                    "1 ==> List Users\n" +
                    "2 ==> List Books\n" +
                    "3 ==> Save Member\n" +
                    "4 ==> Add Book\n" +
                    "5 ==> Give Book to User\n" +
                    "6 ==> Get Back Book from User\n" +
                    "0 ==> EXIT");
            select = scan.nextInt();
            //System.out.println();
            switch (select){
                case 1:
                    userService.listUser();
                    break;
                case 2:
                    bookService.listBook();
                    break;
                case 3:
                    userService.createUser();
                    break;
                case 4:
                    bookService.createBook();
                    break;
                case 5:
                    userService.borrowBook();
                    break;
                case 0:
                    System.out.println("Thank you for prefering our library\n" +
                            "Have a nice day!\n" +
                            "Happy Reading!!");

            }
        }while (select !=0);

    }
}
