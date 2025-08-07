public class Main1 {
    public static void main(String[] args) {
        Library library = new Library();

        // Users
        User abhishek = new User("Abhishek", 1);
        User priya = new User("Priya", 2);

        // Books
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Atomic Habits", "James Clear"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        // Show available books
        library.showBooks();

        // Issue book to Abhishek
        library.issueBook("The Alchemist", abhishek);
        library.showBooks();

        // Try issuing same book to Priya
        library.issueBook("The Alchemist", priya);

        // Return book by Priya (should not be allowed)
        library.returnBook("The Alchemist", priya);

        // Correct return by Abhishek
        library.returnBook("The Alchemist", abhishek);
        library.showBooks();
    }
}
