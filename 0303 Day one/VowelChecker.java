import java.util.Scanner;

public class VowelChecker {
    
    public static void main(String[] args) {
        System.out.println("Vowel Checker");

        System.out.println("Enter the character");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch+0<=90 && ch>=65) {
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println("Vowel hai re baba");
            } else {
                System.out.println("Vowel nahi hai re");
            }
        } else if (ch+0<=122 && ch>=97) {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println("Vowel hai re baba");
            } else {
                System.out.println("Vowel nahi hai re");
            }
        } else {
            System.out.println("Not valid alphabet");
        }

    }
}
