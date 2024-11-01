import java.util.Scanner;
public class IT24201195Lab3Q1B{
    public static void main(String[] args){
        
        System.out.print("Enter price of 1kg- ");
        Scanner input1 = new Scanner(System.in);
        double price1kg = input1.nextDouble();
        
         
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter number of kilograms you want to buy - ");
        double noofkg = input2.nextDouble();
       
       
        double fullprice = noofkg * price1kg;
  
        double discount = fullprice*10/100;
        
        double finalprice = fullprice - discount;
    
        
         System.out.print("total price with 10% discount = " + finalprice);
         
        
        
    } 
}