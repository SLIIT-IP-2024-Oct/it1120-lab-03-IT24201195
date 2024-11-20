import java.util.Scanner;
public class IT24201195Lab3Q2 {
    public static void main(String[] args){
        double monthlySalary, otRate;
        int otHours;
        System.out.print("Enter monthly salary: ");
        Scanner salInput = new Scanner(System.in);
        monthlySalary = salInput.nextDouble();
        
        System.out.print("Enter OT Hours: ");
        Scanner otHoursInput = new Scanner(System.in);
        otHours = otHoursInput.nextInt();
        
         System.out.print("Enter OT Hourly rate: ");
         Scanner otRateInput = new Scanner(System.in);
         otRate = otRateInput.nextDouble();
         
         double totalSalary = monthlySalary + otRate*otHours;
         System.out.println("The total salary including OT is " + totalSalary);
    }
}
    
