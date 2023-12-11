package src.lesson12.group1;

public class Security extends Employee {

    public String checkDevice;

    public Security(String name, String surname, int age, String position, int salary, String checkDevice) {
        super(name, surname, age, position, salary);
        this.checkDevice = checkDevice;
    }
}
