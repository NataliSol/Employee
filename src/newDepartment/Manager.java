package newDepartment;


public class Manager extends Employee {

    public Manager( String name, int age, double salary, String gender) {
        super( name, age, salary, gender);
    }

    @Override
    public void info() {
        System.out.println("Manager: "+" id=" + getId() + " name=" + getName() + " age=" + getAge() + " salary=" + getSalary() +
                " gender=" + getGender());
    }
}

