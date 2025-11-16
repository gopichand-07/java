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

    void displayManagerInfo() {
        displayInfo();
        System.out.println("Department: " + department);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "John";
        m.salary = 50000;
        m.department = "HR";

        m.displayManagerInfo();
    }
}
