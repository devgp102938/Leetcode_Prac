import java.util.*;

class Employees{
    protected String name;
    protected double Salary;

    Employees(String name, double Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Salary of Employee: " + Salary);
    }
}

class Developer extends Employees{

    String programmingLanguage;

    Developer(String name, double Salary, String programmingLanguage) {
        super(name, Salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Salary of Employee: " + Salary);
        System.out.println("Programming langauge: " + programmingLanguage);
    }
    
}

class EmployeeInheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter Salary: ");
        double Salary = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter Programming Language: ");
        String programmingLanguage = sc.nextLine();

        Developer dev = new Developer(name, Salary, programmingLanguage);

        dev.displayInfo()
    }
}