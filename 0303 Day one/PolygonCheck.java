import java.util.Scanner;

public class PolygonCheck {

    public static void main(String[] args) {
        System.out.println("Polygon Check");

        boolean polygon = false;
        boolean square = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 4 sides of polygon:");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();

        System.out.println("Length of sides: "+ one + " " + two + " " + three + " " + four);

        if( one>(two+three+four) || two>(one+three+four) || three>(one+two+four) || four>(one+two+three)) {
            
        } else {
            polygon = true;
            if(one == two && two == three && three == four && four == one) {
                square = true;
            }
        }

        System.out.print("Polygon Status: ");
        if(polygon) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.print("Square Status: ");
        if(square) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
