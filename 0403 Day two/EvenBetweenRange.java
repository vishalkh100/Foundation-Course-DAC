import java.util.Scanner;

public class EvenBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number");
        int start = sc.nextInt();
        System.out.println("Enter end number");
        int end = sc.nextInt();

        System.out.printf("even numbers between %d and %d:\n", start, end);
        
        for(int i=start; i<=end; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
    }
}
