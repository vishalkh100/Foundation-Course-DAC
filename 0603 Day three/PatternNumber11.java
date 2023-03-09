public class PatternNumber11 {
    public static void main(String[] args) {

        int start = 97;

        for(int i = 1; i<=3; i++, start = 97) {

            for (int j = 1; j <= i; j++) {
                char ch = (char) start;
                System.out.print(ch);
                start++;
            }

            System.out.println();
        }
    }
}