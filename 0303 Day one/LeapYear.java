import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Leap Year Checker");

        System.out.println("Enter the year to check");

        Scanner sc = new Scanner(System.in);
        Integer year = sc.nextInt();

        System.out.println("the entered year is: " + year);
        

        if(year%4==0 && year%100!=0) {
            System.out.println("That is a leap year");
        } else {
            if(year%400==0) {
                System.out.println("That is a leap year");
            } else {
                System.out.println("That is not a leap year");
            }
        }

    }
}
