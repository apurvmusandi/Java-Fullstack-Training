import java.util.ArrayList;

public class que5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        int indexToRetrieve = 2;
        String fruit = fruits.get(indexToRetrieve);

        System.out.println("The element at index " + indexToRetrieve + " is: " + fruit);
    }
}
