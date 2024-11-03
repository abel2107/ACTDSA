public class Employee {
    // Attributes of the Employee class
    String name;
    int age;
    String department;
    double salary;

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    // Main method to create and display employee details
    public static void main(String[] args) {
        // Creating an employee object with details
        Employee employee1 = new Employee("Alice", 30, "IT", 75000.00);

        // Displaying the employee details
        employee1.displayDetails();
    }
}