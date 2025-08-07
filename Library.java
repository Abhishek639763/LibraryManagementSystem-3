import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void showBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isIssued()) {
                    book.issueBook(user);
                    System.out.println("Book '" + title + "' issued to " + user.getName());
                } else {
                    System.out.println("Book '" + title + "' is already issued to " + book.getIssuedTo().getName());
                }
                return;
            }
        }
        System.out.println("Book '" + title + "' not found.");
    }

    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isIssued()) {
                    if (book.getIssuedTo().getUserId() == user.getUserId()) {
                        book.returnBook();
                        System.out.println("Book '" + title + "' returned by " + user.getName());
                    } else {
                        System.out.println(
                                "You cannot return this book. It was issued to " + book.getIssuedTo().getName());
                    }
                } else {
                    System.out.println("Book '" + title + "' is not issued to anyone.");
                }
                return;
            }
        }
        System.out.println("Book '" + title + "' not found.");
    }
}
