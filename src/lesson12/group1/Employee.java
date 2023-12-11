package src.lesson12.group1;

//           subclass         superclass
public class Employee extends Human {

    public String position;
    public int salary;
    protected String pro;

    public Employee(String name, String surname, int age, String position, int salary) {
        super(name, surname, age);
//        super(name);
//        super.name = "sdkjfn";
        this.position = position;
        this.salary = salary;
    }

    public void salamlamaEmployee() {
        System.out.println("Salam Employee " + super.name);
    }
}
