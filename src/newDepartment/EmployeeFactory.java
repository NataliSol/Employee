package newDepartment;

import java.util.Random;

public class EmployeeFactory {


    public static Employee[] generateEmployees(int size) {
        String[] manNames = {"Alex", "Geoge", "Mike", "James", "Michael", "William", "Joseph", "Charles"};
        String[] womanNames = {"Amelia", "Charlotte", "Emma", "Olivia", "Mary", "Patricia", "Mia", "Karen"};

        Employee[] employees = new Employee[size];
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            String gender = rnd.nextInt(2) == 1 ? "male" : "femele";
            String name = gender.equals("male") ? manNames[rnd.nextInt(manNames.length)] : womanNames[rnd.nextInt(womanNames.length)];
            int age = rnd.nextInt(60 - 22) + 22;
            int salary = rnd.nextInt(2000 - 500) + 500;
            Employee employee = null;
            int typeProfesionals = rnd.nextInt(3);
            if (typeProfesionals == 0) {
                int fixedBugs = rnd.nextInt(20 - 5) + 5;
                double defaultBugRate = (rnd.nextInt(5 - 2) + 2) * 10.0;
                employee = new Developer(name, age, salary, gender, fixedBugs);
            }
            if (typeProfesionals == 1) {
                int generateWorkedDays = rnd.nextInt(31);
                int rate = rnd.nextInt(3);
                employee = new Designer(name, age, salary, gender, rate, generateWorkedDays);
            }
            if (typeProfesionals == 2) {
                employee = new Manager(name, age, salary, gender);
            }
            employees[i] = employee;
        }
        return employees;
    }

}

