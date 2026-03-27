public class EBook extends Book{

    public EBook(String title) {
        super(title);
    }

    @Override
    public boolean borrowBook(User user) {
        return canUserBorrow(user);
    }

    @Override
    public void returnBook() {
    }

    @Override
    public String getType() {
        return "EBook";
    }
}
