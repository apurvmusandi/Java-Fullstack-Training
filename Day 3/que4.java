import java.util.ArrayList;

public class que4 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");
        
        System.out.println("Original list: " + languages);

        languages.add(1, "Python");

        System.out.println("Updated list : " + languages);
    }
}
