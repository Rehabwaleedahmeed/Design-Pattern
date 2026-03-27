public class PhysicalBook extends Book{

    public PhysicalBook(String title) {
        super(title);
    }

    @Override
    public String getType() {
        return "Physical";
    }
}
