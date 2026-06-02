class Employee {
    private int empId;
    private String name;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


public class encap2 {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(501);
        e.setName("John");
        e.setSalary(75000.0);

        System.out.println("ID: " + e.getEmpId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
    
}



