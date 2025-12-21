import java.util.Objects;

public class Book {
    private int id;
    private static int idGen = 0;
    private String title;
    private String author;
    private int year;
    private boolean available;
    Book() {
        this.id = idGen++;
        this.available = true;
    }
    public Book(String title, String author, int year) {
        this();
        setTitle(title);
        setAuthor(author);
        setYear(year);

    }

    public int getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if ((!Objects.equals(title, ""))&&(!title.isEmpty())) {
            this.title = title;
        }

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if ((!Objects.equals(author, ""))&&(!author.isEmpty())) {
            this.author = author;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if ((1500<=year)&&(year<=2025)) {
            this.year = year;
        }

    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void markAsBorrowed() {
        available = false;
    }
    public void markAsReturned() {
        available = true;

    }
    @Override
    public String toString() {
        return (" \n Book: id = " + id + " , author = " + author + " , title = " + title + " , year = " + year + " , available = " + available);
    }
}
