class Employee {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Rahul";
        m.salary = 75000;
        m.department = "IT";
        m.displayInfo();
    }
}
