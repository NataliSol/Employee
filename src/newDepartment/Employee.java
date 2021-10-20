package newDepartment;

public class Employee {
    private static long lastNumber;
    private long id;
    private String name;
    private int age;
    private double salary;
    private String gender;

    public Employee(String name, int age, double salary, String gender) {
        this.id = ++lastNumber;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double countSalary() {
        return salary;
    }

    public void info() {
        System.out.println(" id=" + id + " name=" + name + " age=" + age + " salary=" + salary + " gender=" + gender);

    }
}

