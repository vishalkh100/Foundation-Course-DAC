import java.util.Scanner;

public class UnitCost {
    public static void main(String[] args) {
        System.out.println("Unit Checker");

        System.out.println("Enter the units: ");

        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double cost;

        if(units<=200 && units>=0) {
            cost = units * 0.5;
            System.out.println("The total cost is: "+ cost);
        } else if(units<=400 && units > 200) {
            cost = (units - 200) * 0.65 + 100;
            System.out.println("The total cost is: "+ cost);
        } else if(units<=600 && units > 400) {
            cost = (units - 400) * 0.80 + 230;
            System.out.println("The total cost is: "+ cost);
        } else if(units>600) {
            cost = (units - 600) + 390;
            System.out.println("The total cost is: "+ cost);
        } else {
            System.out.println("Invalid Input");
        }

    }
}
