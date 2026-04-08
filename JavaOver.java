import java.util.Scanner;

class JavaOver {
    void Calculate() {
        System.out.println("Base class method");
    }
}

class Add extends JavaOver {
    int Calculate(int a, int b) {
        return a + b;
    }
}

class Sub extends JavaOver {
    int Calculate(int a, int b, int c) {
        return a - b - c;
    }
}

class Mul extends JavaOver {
    int Calculate(int a, int b, int c) {
        return a * b * c;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Add adds = new Add();
        Sub subs = new Sub();
        Mul muls = new Mul();

        System.out.println("Addition: " + adds.Calculate(1, 2));
        System.out.println("Subtraction: " + subs.Calculate(5, 2, 1));
        System.out.println("Multiplication: " + muls.Calculate(2, 3, 4));

        sc.close();
    }
}
