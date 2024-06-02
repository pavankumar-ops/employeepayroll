package EmployeeSystem;

public class Main {

    public static void main(String[] args) { PayrollSystem payrollSystem = new PayrollSystem(); FullTimeEmployee emp1 = new FullTimeEmployee("Pavan", 1, 70000); PartTimeEmployee emp2 = new PartTimeEmployee("Akshay", 2, 45, 1200); // Assuming 35 hours worked and $1200 hourly rate

    payrollSystem.addEmployee(emp1);
    payrollSystem.addEmployee(emp2);
    System.out.println("Initial Employee Details:");
    payrollSystem.displayEmployees();
    System.out.println("Removing Employee with ID 2");
    payrollSystem.removeEmployee(2);
    System.out.println("Remaining Employee Details:");
    payrollSystem.displayEmployees();
}

}
