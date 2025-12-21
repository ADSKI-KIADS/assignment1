
import java.util.ArrayList;
import java.util.Scanner;
class LibraryApp {
    private ArrayList<Book> books;
    private Scanner scanner;
    private boolean meanning = true;

    LibraryApp() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    private void Menu () {
        System.out.println("\n Welcome to Library App!");
        System.out.println("1. Print all books ");
        System.out.println("2. Add new book ");
        System.out.println("3. Search books by title");
        System.out.println("4. Borrow a book");
        System.out.println("5. Return a book");
        System.out.println("6. Delete a book by id");
        System.out.println("7. Quit");

    }
    private int ReadInt() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    private void PrintAllbooks() {
        if (books.isEmpty()) {
            System.out.println("No book in the library;");
        }
        else {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }
    private void AddNewBook(){
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = ReadInt();
        Book book = new Book(title,author , year);
        books.add(book);

    }
    private void SearchBooksBVTitle(){
        String part = scanner.nextLine();
        for (Book book : books ) {
            if (book.getTitle().contains(part)) {
                System.out.println(book);
            }
        }
    }
    private void BorrowABook() {
        int id = ReadInt();
        for (Book book : books ) {
            if (book.getId()==id) {
                if (book.isAvailable()) {
                    book.markAsBorrowed();

                }
                else {
                    System.out.println("Book is already borrowed");
                }
            }
        }
    }
    private void ReturnABook() {
        int id = ReadInt();
        for (Book book : books ) {
            if (book.getId()==id) {
                if (!book.isAvailable()) {
                    book.markAsReturned();

                }

            }
        }
    }
    private Book FindBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }


    private void DeleteABookByID() {
        int id = ReadInt();
        Book book = FindBookById(id);
        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        books.remove(book);
    }
    private void Quit() {
        meanning = false;

    }
    public void run() {

        while (meanning) {
            Menu();
            int choise = ReadInt();
            switch (choise) {
                case 1:
                    PrintAllbooks();

                case 2:
                    AddNewBook();

                case 3:
                    SearchBooksBVTitle();

                case 4:
                    BorrowABook();

                case 5:
                    ReturnABook();

                case 6:
                    DeleteABookByID();

                case 7:
                    Quit();

            }
        }





    }
}

