import java.util.ArrayList;

public class que1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 5);
        }

        // 3. Display all elements using a for-each loop
        System.out.println("Elements in the ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
