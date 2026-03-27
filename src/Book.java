public class Book implements BookInterface{
    private final String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean borrowBook(User user) {
        if (!canUserBorrow(user) || !isAvailable) {
            return false;
        }

        isAvailable = false;
        return true;
    }

    @Override
    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String getType() {
        return "General";
    }

    protected boolean canUserBorrow(User user) {
        return user != null;
    }

}
