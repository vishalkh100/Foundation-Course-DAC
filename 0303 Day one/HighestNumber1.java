import java.util.Scanner;

public class HighestNumber1 {
    public static void main(String[] args) {
        System.out.println("Highest Number 1");

        System.out.println("Enter three integers:");

        Scanner sc = new Scanner(System.in);
        Integer one = sc.nextInt();
        Integer two = sc.nextInt();
        Integer three = sc.nextInt();

        Integer highest = 0;

        System.out.println("the numbers are: " + one + ", " + two + " and " + three);

        if(one>two) {
            if(one>three) {
                highest = one;
            }
            else if(two>three) {
                highest = two;
            } else {
                highest = three;
            }
        } else {
            if(two>three) {
                highest = two;
            } else {
                highest = three;
            }
        }

        System.out.println("the highest number is: " + highest);

    }
}
