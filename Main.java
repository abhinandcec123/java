import java.util.Scanner;

// Base Class
class Person {
    String name, gender, address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Derived Class
class Employee extends Person {
    int empid;
    String companyName, qualification;
    double salary;

    Employee(String name, String gender, String address, int age,
             int empid, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Further Derived Class
class Teacher extends Employee {
    String subject, department;
    int teacherid;

    Teacher(String name, String gender, String address, int age,
            int empid, String companyName, String qualification, double salary,
            String subject, String department, int teacherid) {

        super(name, gender, address, age, empid, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    void display() {
        System.out.println("Teacher ID: " + teacherid);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Emp ID: " + empid);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("---------------------------");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Emp ID: ");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Teacher ID: ");
            int teacherid = sc.nextInt();
            sc.nextLine();

            t[i] = new Teacher(name, gender, address, age,
                    empid, companyName, qualification, salary,
                    subject, department, teacherid);
        }

        System.out.println("\n--- Teacher Details ---");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}
