import java.util.Scanner;

public class TableTillNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Multiplication Table upto the number "+num+": ");

        for(int i=1; i<=10; i++) {
            for(int j=1; j<=num; j++) {
                int mult = i*j;
                System.out.printf("%d x %d = %d \t", j, i, mult);
            }
            System.out.println("");
        }
        

    }
}
