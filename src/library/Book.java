package library;

public class Book {

    private String bookName;
    private String writerName;
    private Integer year;
    private Integer pages;

    public Book() {
    }

    public Book(String bookName, String writerName, Integer year, Integer pages) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.year = year;
        this.pages = pages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        try {
                this.year = year;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        if(pages>0){
            this.pages = pages;
        }else {
            System.out.println("The page number should be greater then 0");
        }
    }
}
