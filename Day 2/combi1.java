interface Borrowable {
    void borrowItem();
}

abstract class LibraryItem {
    private String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void display();
}

class Book extends LibraryItem implements Borrowable {
    public Book(String title) {
        super(title);
    }

    @Override
    public void display() {
        System.out.println("Book Title: " + getTitle());
    }

    @Override
    public void borrowItem() {
        System.out.println("Checking out: " + getTitle());
    }
}

public class combi1 {
    public static void main(String[] args) {
        Book myBook = new Book("Java Basics");
        myBook.display();
        myBook.borrowItem();
    }
}
