package src.lesson12.group1;

import src.lesson12.group1.Employee;

public class Developer extends Employee { // Developer is a Employee

    public String computerModel;

    public Developer(String name, String surname, int age, String position, int salary, String computerModel) {
        super(name, surname, age, position, salary);
        this.computerModel = computerModel;
    }

    public void foo() {
        System.out.println(super.pro);;
    }
}
