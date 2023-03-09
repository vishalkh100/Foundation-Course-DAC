import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of the number "+num+": ");

        for(int i=1; i<=10; i++) {
            int mult = num*i;
            System.out.printf("%d x %d = %d\n", num, i, mult);
        }

    }
}
