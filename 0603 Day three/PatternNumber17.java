public class PatternNumber17 {
    public static void main(String[] args) {
        int num = 3;

        for(int i=1; i<=num; i++) {

            int spaces = 3 - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i*2-1; j++) {
                if(j%2==0) {
                    System.out.print(2);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
