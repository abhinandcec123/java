class MultiplicationTable extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

class PrimeNumbers extends Thread {
    int n;

    PrimeNumbers(int n) {
        this.n = n;
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        PrimeNumbers pn = new PrimeNumbers(5);
        mt.start();
        pn.start();
    }
}
