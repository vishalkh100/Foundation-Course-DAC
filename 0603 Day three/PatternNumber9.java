public class PatternNumber9 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {

            int spaces = i-1;
            int cols = 2*n-i-(i-1);
            int max = n - i + 1;
            int k = n-i;
            int n_temp = n;


            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            while(k!=0) {
                System.out.print(n_temp);
                n_temp--;
                k--;
            }

            for (int j = cols; j >= 1; j--) {
                
                if(j <= max)  {
                    System.out.print(n - j + 1);
                }
                
            }

            System.out.println();

        }
    }
}