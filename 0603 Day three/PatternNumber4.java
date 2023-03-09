public class PatternNumber4 {
    public static void main(String[] args) 
    {
        int value = 1;
        System.out.println("Here is your pattern :");
         
        for (int i=1; i<=3; i++) 
        {
            for (int j=1; j<=i; j++) 
            {
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }    
}
