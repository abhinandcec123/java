import java.util.Scanner;

public class SortStringCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        // Bubble sort for characters
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {

                    char temp = chars[j];   
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        String sortedString = new String(chars);   

        System.out.println("Sorted string in ascending order: " + sortedString);

        sc.close();
    }
}
