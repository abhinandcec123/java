class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Average {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Enter number:");
                int num = scanner.nextInt();
                if (num < 0) {
                    throw new NegativeNumberException("Negative number not allowed!");
                }
                sum += num;
                count++;
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Average: " + (sum / (double) count));
    }
}
