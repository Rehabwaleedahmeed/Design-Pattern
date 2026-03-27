public interface BookInterface {
     String getTitle();
     boolean isAvailable();
     boolean borrowBook(User user);
     void returnBook();
     String getType();
}
