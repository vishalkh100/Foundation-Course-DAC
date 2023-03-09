public class PatternNumber12 {
    public static void main(String[] args) {
        int n = 122;

        for (int i = 1; i <= 3; i++) {

            int spaces = i-1;
            int cols = 2*n-i-(i-1);
            int max = 3 - i + 1;
            int k = 3-i;
            int n_temp = n;


            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            while(k!=0) {
                System.out.print((char)n_temp);
                n_temp--;
                k--;
            }

            for (int j = cols; j >= 1; j--) {
                
                if(j <= max)  {
                    System.out.print((char)(n - j + 1));
                }
                
            }

            System.out.println();

        }
    }
}