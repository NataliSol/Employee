package newDepartment;

public class Designer extends Employee {
    private int rate;
    private int workedDays;

    public Designer(String name, int age, double salary, String gender, int rate, int workedDays) {
        super(name, age, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;
    }

    @Override
    public double countSalary() {
        return getSalary() + rate * workedDays;
    }

    @Override
    public void info() {
        System.out.println("Designer: " + " id=" + getId() + " name=" + getName() + " age=" + getAge() + " salary=" + getSalary() +
                " gender=" + getGender() + "rate= " + rate + " workedDays=" + workedDays);
    }
}

