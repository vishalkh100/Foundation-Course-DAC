import java.util.Scanner;

public class DivisibiltyEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end number");
        int end = sc.nextInt();

        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.printf("even numbers between 1 and %d: divisible by %d\n", end, num);
        
        for(int i=1; i<=end; i++) {
            if(i%num==0) {
                System.out.print(i + " ");
                if(i%2==0) {
                    System.out.println("is even");
                } else {
                    System.out.println("is odd");
                }
            }
            
        }
    }
}
