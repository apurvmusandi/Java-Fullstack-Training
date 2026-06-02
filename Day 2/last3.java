import java.util.ArrayList;

class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        setGrade(grade);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be between 0 and 100.");
        }
    }
}

class StudentManager {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Added: " + student.getName());
    }

    public void displayAllStudents() {
        System.out.println("\n--- Student List ---");
        for (Student s : studentList) {
            System.out.println("ID: " + s.getId() + " | Name: " + s.getName() + " | Grade: " + s.getGrade());
        }
    }
}

public class last3 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Alice", 92.5);
        Student s2 = new Student(102, "Bob", 78.0);

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.displayAllStudents();

        System.out.println("\nUpdating Alice's grade...");
        s1.setGrade(95.0);
        
        System.out.println("Trying to set invalid grade...");
        s2.setGrade(150.0);

        manager.displayAllStudents();
    }
}
