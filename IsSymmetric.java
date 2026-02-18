import java.util.Scanner;

class IsSymmetric {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();

        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();

        if (r != c) {
            System.out.println("It is not Symmetric");
            sc.close();
            return; 
        }

        int[][] matrix = new int[r][c];

        System.out.println("Enter the MATRIX elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean symmetric = true;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric) {
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrix is not symmetric");
        }

        sc.close();
    }
}



