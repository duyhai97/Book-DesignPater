package Model;

public class FictionBook extends Book {
    private String category;
    public FictionBook(int id, String name, int price, String author) {
        super(id, name, price, author);
    }

    public FictionBook(int id, String name, int price, String author, String category) {
        super(id, name, price, author);
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + "category='" + category;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
