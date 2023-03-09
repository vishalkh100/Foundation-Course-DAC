import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println("Tax Calc");

        System.out.println("Enter the sex and salary: ");

        Scanner sc = new Scanner(System.in);
        char sex = sc.next().charAt(0);
        Integer salary = sc.nextInt();

        double netSalary;
        
        if(salary<=0) {
            System.out.println("Invlaid Input");
        } else {
            if(sex=='f' || sex =='F') {
                if(salary>5000){
                    netSalary = salary - (salary * 0.03);
                    System.out.println("Net Salary: " + netSalary);
                } else {
                    netSalary = salary - (salary * 0.01);
                    System.out.println("Net Salary: " + netSalary);
                }
            } else if (sex=='m' || sex =='M') {
                if(salary>8000){
                    netSalary = salary - (salary * 0.05);
                    System.out.println("Net Salary: " + netSalary);
                } else {
                    netSalary = salary - (salary * 0.02);
                    System.out.println("Net Salary: " + netSalary);
                }
            }
        }
    }
}
