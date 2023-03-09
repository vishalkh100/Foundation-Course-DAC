import java.util.Scanner;

public class CaseChangeChar {
    public static void main(String[] args) {
        System.out.println("Character Case Changer");

        System.out.println("Enter the character to change its case: ");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char ch2;

        if(ch+0<=90 && ch>=65) {
            ch2 = (char) (ch+32);
            System.out.println("After case change: "+ch2);
        } else if (ch+0<=122 && ch>=97) {
            ch2 = (char) (ch-32);
            System.out.println("After case change: "+ch2);
        } else {
            System.out.println("Not valid alphabet");
        }

    }
}
