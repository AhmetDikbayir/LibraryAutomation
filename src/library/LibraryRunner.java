package library;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        libraryService.entryMenu();
    }
}
