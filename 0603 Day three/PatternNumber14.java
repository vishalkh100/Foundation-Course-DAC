public class PatternNumber14 {
    public static void main(String[] args) {
        int num = 4;

        for(int i=1; i<=num; i++) {

            int spaces = num - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
