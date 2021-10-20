package newDepartment;

import java.util.Random;

public class Developer extends Employee {
    int fixedBugs;

    public Developer(String name, int age, double salary, String gender, int fixedBugs) {
        super(name, age, salary, gender);
        this.fixedBugs = fixedBugs;
    }

    @Override
    public double countSalary() {
        return (getSalary() + fixedBugs * 3) * (new Random().nextBoolean() ? 2 : 0);
    }

    @Override
    public void info() {
        System.out.println("Developer=" + " id=" + getId() + " name=" + getName() + " age=" + getAge() + " salary=" + getSalary() +
                " gender=" + getGender() + "fixedBugs" + fixedBugs);
    }
}

