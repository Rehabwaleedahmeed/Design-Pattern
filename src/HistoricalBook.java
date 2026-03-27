public class HistoricalBook extends Book {
    public HistoricalBook(String title) {
        super(title);
    }

    @Override
    protected boolean canUserBorrow(User user) {
        return user != null && user.isPremium();
    }

    @Override
    public String getType() {
        return "Historical";
    }
 }
