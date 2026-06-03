import java.util.ArrayList;

public class que2 {
    public static void main(String[] args) {
        // 1. Create an ArrayList of student names
        ArrayList<String> students = new ArrayList<>();

        // 2. Add names to the list
        students.add("Apurv");
        students.add("Bobbya");
        students.add("Chalu");
        students.add("Daina");

        // 3. Display all names
        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
