public class Program18 {
    public static void main(String[] args) {

        String string = "2156897456";
        char[] a = string.toCharArray();
        int length = 1;
        int max_length = 1;
        int i = 0;
        int index = 0;
        int t_index = 0;
        boolean stay = false;

        while(i<a.length-1) {
            if(a[i]<a[i+1]) {
                if(!stay) {
                    t_index = i;
                }
                stay = true;
                length++;
                if(length>max_length) {
                    max_length = length;
                    index = t_index;
                }
            } else {
                stay = false;
                length = 1;
            }
            i++;
        }

        System.out.println("LIS is:");
        for (int j = index; j < index + max_length; j++) {
            System.out.print(a[j]);
        }

    }

}
