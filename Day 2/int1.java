interface Printable {
    void print();
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document content successfully.");
    }
}

public class int1 {
    public static void main(String[] args) {
        Printable doc = new Document();
        doc.print();
    }
}
