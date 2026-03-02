import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    void getEmployeeData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();  
    }

    void displayEmployeeData() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Teacher extends Employee {
    String subject;
    String department;

    void getTeacherData(Scanner sc) {
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayTeacherData() {
        displayEmployeeData();
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();  

        Teacher[] teachers = new Teacher[n];

 
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));
            teachers[i] = new Teacher();
            teachers[i].getEmployeeData(sc);
            teachers[i].getTeacherData(sc);
        }

  
        System.out.println("\n--- All Teacher Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nTeacher " + (i + 1));
            teachers[i].displayTeacherData();
        }

        sc.close();
    }
}
