public class PatternNumber7 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {

                int element = (j<=i) ? j : i+i-j;

                System.out.print(element);
            }
            System.out.println();
        }
      
    }
}
