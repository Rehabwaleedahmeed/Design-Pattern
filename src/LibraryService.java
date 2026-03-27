public class LibraryService {
    private final BookRepository bookRepository;
    private final MessageService messageService;

    public LibraryService(BookRepository bookRepository, MessageService messageService) {
        this.bookRepository = bookRepository;
        this.messageService = messageService;
    }

    public void addBook(BookInterface book) {
        bookRepository.add(book);
    }

    public void borrowBook(String title, User user) {
        BookInterface book = bookRepository.findByTitle(title);
        if (book == null) {
            messageService.send("Book not found: " + title);
            return;
        }

        if (book.borrowBook(user)) {
            messageService.send(user.getName() + " borrowed [" + book.getType() + "] " + book.getTitle());
        } else {
            messageService.send("Borrow failed for " + book.getTitle());
        }
    }

    public void returnBook(String title) {
        BookInterface book = bookRepository.findByTitle(title);
        if (book == null) {
            messageService.send("Book not found: " + title);
            return;
        }

        book.returnBook();
        messageService.send(book.getTitle() + " was returned.");
    }
}
