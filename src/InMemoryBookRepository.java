import java.util.ArrayList;
import java.util.List;

public class InMemoryBookRepository implements BookRepository {
    private final List<BookInterface> books = new ArrayList<>();

    @Override
    public void add(BookInterface book) {
        books.add(book);
    }

    @Override
    public BookInterface findByTitle(String title) {
        for (BookInterface book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
