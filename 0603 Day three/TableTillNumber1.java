import java.util.Scanner;

public class TableTillNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Multiplication Table upto the number "+num+": ");

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=10; j++) {
                int mult = i*j;
                System.out.printf("%d x %d = %d\n", i, j, mult);
            }
            System.out.println("-----------");
            System.out.println("");
        }
    }
}
