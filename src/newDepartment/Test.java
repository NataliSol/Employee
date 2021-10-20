package newDepartment;

public class Test {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        System.out.println("***************** Employees database *****************");
        employeeService.printEmployees();

        System.out.println("***************** Get by ID *****************");
        employeeService.getById(2).info();

        System.out.println("***************** Get by Name *****************");
        Employee employee = employeeService.getByName("Mike");
        if (employee != null) {
            employee.info();
        } else {
            System.out.println("Employee not found");
        }

        System.out.println("***************** Remove Employee *****************");
        employee = employeeService.remove(3);
        if (employee != null) {
            System.out.println("Employee was deleted");
        } else {
            System.out.println("Employee not found");
        }
        System.out.println("***************** Add Employee *****************");
        Developer middle=new Developer("Nata", 28,2000,"female",5);
        employeeService.add(middle);
        employeeService.printEmployees();
    }
}
