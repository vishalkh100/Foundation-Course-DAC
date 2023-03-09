import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Triangle Check");

        boolean triangle = false;
        boolean notSpecial = false;
        boolean right = false;
        boolean equilateral = false;
        boolean isosceles = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 3 sides of triangle: ");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        System.out.println("Length of sides: "+ one + " " + two + " " + three);

        if(one>two+three || two>three+one || three>one+two) {

        } else {
            triangle = true;
            if(one*one == two*two + three*three || two*two == one*one + three*three || three*three == one*one + two*two ) {
                right = true;
            } else {
                if(one==two && two==three && three==one) {
                    equilateral = true;
                } else if (one==two || two==three || three==one) {
                    isosceles = true;
                } else {
                    notSpecial = true;
                }
            }
        }

        System.out.print("Invaild Status: ");
        if(triangle) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        System.out.print("Right Angled: ");
        if(right) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.print("Isosceles: ");
        if(isosceles) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.print("Equilateral: ");
        if(equilateral) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.print("Not Special: ");
        if(notSpecial) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
