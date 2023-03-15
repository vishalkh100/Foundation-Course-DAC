import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] arr = new int[n][n];
        int sum = 0;

        System.out.printf("Enter integers in a %dx%d matrix:\n", n, n);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Entered matrix is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++, sum = 0) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.printf("Sum of row number %d is %d\n", i+1, sum);
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++, sum = 0) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[j][i];
            }
            System.out.printf("Sum of column number %d is %d\n", i+1, sum);
        }

    }
}
