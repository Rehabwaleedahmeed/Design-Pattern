public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new InMemoryBookRepository();
        MessageService messageService = new ConsoleMessageService();
        LibraryService alexLibrary = new LibraryService(bookRepository, messageService);

        alexLibrary.addBook(new PhysicalBook("Harry Potter"));
        alexLibrary.addBook(new EBook("Clean Code"));
        alexLibrary.addBook(new HistoricalBook("Ancient Egypt"));

        User user = new User("John", true);

        alexLibrary.borrowBook("Harry Potter", user);
        alexLibrary.borrowBook("Clean Code", user);
        alexLibrary.borrowBook("Ancient Egypt", user);
        alexLibrary.returnBook("Harry Potter");

    }
}
