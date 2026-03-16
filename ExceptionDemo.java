import java.util.Scanner;


class MyArrayException extends RuntimeException {
    MyArrayException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        int arr[] = {1, 2, 3};
        System.out.print("Enter array index: ");
        int index = sc.nextInt();

        try {
            if(index >= arr.length || index < 0) {
                throw new MyArrayException("Index out of bounds!");
            }
            System.out.println("Value: " + arr[index]);
        } catch (MyArrayException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
