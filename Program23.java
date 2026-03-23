class Fibonacci implements Runnable {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    public void run() {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci: " + a);
            int temp = a;
            a = b;
            b = temp + b;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

class EvenNumbers implements Runnable {
    int start, end;

    EvenNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(5);
        EvenNumbers even = new EvenNumbers(1, 10);
        Thread t1 = new Thread(fib);
        Thread t2 = new Thread(even);
        t1.start();
        t2.start();
    }
}
