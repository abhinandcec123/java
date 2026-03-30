import java.util.*;

class Table5 extends Thread {
    public void run() {
        System.out.println("\nTable of 5:");
        for(int i=1; i<=10; i++) {
            System.out.println("5 x " + i + " = " + (5*i));
        }
    }
}

class Prime extends Thread {
    int n;
    Prime(int n) { this.n = n; }

    public void run() {
        System.out.println("\nPrime numbers up to " + n + ":");
        for(int i=2; i<=n; i++) {
            int flag = 0;
            for(int j=2; j<=i/2; j++) {
                if(i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.print(i + " ");
        }
    }
}

public class ThreadDemo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit for prime numbers: ");
        int n = sc.nextInt();

        Table5 t1 = new Table5();
        Prime t2 = new Prime(n);

        t1.start();
        t2.start();
    }
}
