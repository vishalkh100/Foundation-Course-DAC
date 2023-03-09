import java.util.Scanner;

public class Swap3 {
    public static void main(String[] args) {
        System.out.println("Swap2: EXOR");

        System.out.println("Enter two integers:");

        Scanner sc = new Scanner(System.in);
        Integer one = sc.nextInt();
        Integer two = sc.nextInt();

        System.out.println("the values before swapping are: " + one + " and " + two);

        one = one ^ two;
        two = one ^ two;
        one = one ^ two;

        System.out.println("the values after swapping are: " + one + " and " + two);
    }
    
}
