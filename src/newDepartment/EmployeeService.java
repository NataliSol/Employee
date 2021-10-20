package newDepartment;

public class EmployeeService {
    private Employee[] employees;

    public EmployeeService() {
        employees = EmployeeFactory.generateEmployees(20);
    }

    public void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            employee.info();
        }
    }

    public Employee getById(long id) {
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.getId() == id) {
                return currentEmployee;
            }
        }
        return null;
    }

    public Employee getByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.getName().equals(name)) {
                return currentEmployee;
            }
        }
        return null;
    }


    Employee[] sortByName() {

        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                Employee temp;
                if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees;
    }


    Employee[] sortByNameAndSalary() {

        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                Employee temp;
                if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                } else if (employees[i].getName().equals(employees[j].getName())) {
                    if (employees[i].getSalary() > (employees[j].getSalary())) {
                        temp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = temp;
                    }
                }
            }
        }
        return employees;
    }

    Employee edit(Employee employee) {
        Employee searchEmployee = getById(employee.getId());
        Employee employeeOld = null;
        if (searchEmployee != null) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getId() == employee.getId()) {
                    employeeOld = employees[i];
                    employees[i] = employee;
                    break;
                }
            }
        }

        return employeeOld;
    }

    Employee remove(long id) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getId() == id) {
                Employee[] newEmployee = new Employee[employees.length - 1];
                System.arraycopy(employees, 0, newEmployee, 0, i);
                System.arraycopy(employees, i + 1, newEmployee, i, employees.length - 1 - i);
                employees = newEmployee;
                return employee;
            }
        }
        return null;
    }

    void add(Employee employee) {
        Employee[] newEmployee = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newEmployee[i] = employees[i];
        }
        newEmployee[employees.length] = employee;

        employees = newEmployee;
        System.out.println("The contact was added");
    }
}


