public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee firstEmployee = new Employee("Aleksandrova", "Alisa", "Aleksandrovna", 10, 4);
        Employee secondEmployee = new Employee("Ivanov", "Ivan", "Ivanovich", 10, 1);
        Employee thirdEmployee = new Employee("Mikhailov", "Mihail", "Mihailovich", 1, 3);
        Employee fourthEmployee = new Employee("Andreev", "Andrei", "Andreevich", 10, 5);
        Employee fifthEmployee = new Employee("Sergeev", "Sergei", "Sergeevich", 0, 2);
        Employee sixthEmployee = new Employee("Aleksandrov", "Aleksandr", "Aleksandrovich", 1, 3);
        Employee seventhEmployee = new Employee("Stepanov", "Stepan", "Stepanov", 20, 1);
        Employee eightEmployee = new Employee("Makarova", "Olga", "Makarovna", 10, 5);
        Employee ninethEmployee = new Employee("Zhukova", "Larisa", "Vladimirovna", 10, 3);
        Employee tenthEmployee = new Employee("Tarasova", "Sofia", "Alekseevna", 10, 2);

        employees[0] = firstEmployee;
        employees[1] = secondEmployee;
        employees[2] = thirdEmployee;
        employees[3] = fourthEmployee;
        employees[4] = fifthEmployee;
        employees[5] = sixthEmployee;
        employees[6] = seventhEmployee;
        employees[7] = eightEmployee;
        employees[8] = ninethEmployee;
        employees[9] = tenthEmployee;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName());
        }
        System.out.println();

        calculateAllSalaryAndAverage(employees);
        maxSalary(employees);
        minSalary(employees);
    }

    public static void calculateAllSalaryAndAverage(Employee employees[]) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты сотрудникам за месяц: " + sum + " рублей.");
        int averageSalary = sum / employees.length;
        System.out.println("Средняя зарплата за месяц: " + averageSalary + " рублей.");
    }

    public static void maxSalary(Employee employees[]) {

        int max_Salary = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max_Salary) {
                max_Salary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата за месяц: " + max_Salary + " руб.");

    }

    public static void minSalary(Employee employees[]) {

        int min_Salary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min_Salary) {
                min_Salary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата за месяц составила: " + min_Salary + " руб.");
    }

}



