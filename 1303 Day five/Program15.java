import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        System.out.printf("Enter roll numbers and marks of %d students:\n", n);
        int[] roll = new int[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Roll no of student %d:\n", i+1);
            roll[i] = sc.nextInt();
            System.out.printf("Marks no of student %d:\n", i+1);
            marks[i] = sc.nextInt();
        }

        System.out.println("Entered roll nos and marks");

        for (int i = 0; i < roll.length; i++) {
            System.out.print(roll[i]+" \t");
        }
        System.out.println();

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" \t");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (marks[j - 1] > marks[j]) {
                    int temp = marks[j - 1];
                    marks[j - 1] = marks[j];
                    marks[j] = temp;

                    temp = roll[j - 1];
                    roll[j - 1] = roll[j];
                    roll[j] = temp;
                }

            }
        }

        System.out.println("The roll nos in ascending order of marks are as follows:");

        for (int i = 0; i < roll.length; i++) {
            System.out.print(roll[i]+" \t");
        }
        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" \t");
        }

    }
}
