public interface BookRepository {
    void add(BookInterface book);
    BookInterface findByTitle(String title);
}
