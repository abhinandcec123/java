import java.util.Scanner;

class Employee {
    int Eno;
    String Ename;
    double Salary;


    Employee(int Eno, String Ename, double Salary) {
        this.Eno = Eno;
        this.Ename = Ename;
        this.Salary = Salary;
    }

   
    void display() {
        System.out.println("Employee No: " + this.Eno);
        System.out.println("Employee Name: " + this.Ename);
        System.out.println("Employee Salary: " + this.Salary);
       
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

   
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Employee No: ");
            int eno = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String ename = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(eno, ename, salary);
        }
	System.out.print("\nEnter the Employee No to Search: ");
int EmpSearch = sc.nextInt();

boolean found = false;

for (int i = 0; i < n; i++) {
    if (emp[i].Eno == EmpSearch) {
        System.out.println("Employee Found");
        emp[i].display();
        found = true;
        break;
    }
}

if (!found) {
    System.out.println("Employee Not Found");
}

sc.close();
  }
}
