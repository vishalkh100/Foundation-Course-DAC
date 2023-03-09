public class PatternNumber15 {
    public static void main(String[] args) {

        int n = 3;

        for(int i = 1; i<=n; i++) {

            for (int j = 1; j <= n+1; j++) {
                if(i%2==0) {
                    if(j==1 || j==n+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if(j==1+1 || j==1+2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}