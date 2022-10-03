import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int salary;
    private int department;

    private static int counter;
    private static AtomicInteger counter1 = new AtomicInteger();
    private int id;
    public Employee(String lastName, String firstName, String middleName, int salary, int department) {
        this.id= ++counter;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName = lastName;
    }

    public int getSalary() {
        return this.salary = salary;
    }

    public int getId(){
        return this.id=id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "ID "+this.id+ " Ф.И.0 сотрудника: " + this.lastName + " " + this.firstName + " " + this.middleName + "\n" +" Отдел: " + this.department + "\n"+ " Зарплата: " + this.salary + "\n_______________________________________________________________";
    }

}

