import java.util.ArrayList;

class Book {
    String title;
    boolean isAvailable;

    Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(new Book(title));
        System.out.println("Book added: " + title);
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title) && book.isAvailable) {
                book.isAvailable = false;
                System.out.println("Book issued: " + title);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                book.isAvailable = true;
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java Programming");
        library.addBook("Data Structures");

        library.issueBook("Java Programming");
        library.returnBook("Java Programming");
    }
}
