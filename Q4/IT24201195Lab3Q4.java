import java.util.Scanner;
public class IT24201195Lab3Q4{
public static void main(String[] args){
Scanner input1 = new Scanner(System.in);

System.out.print("Enter a five digit number: ");
int number = input1.nextInt();

if(number < 10000 || number > 99999){
	System.out.println("Please enter a valid five-digit number.");
} else {
	int digit1 = number/10000;
	int digit2 = (number/1000)%10;
	int digit3 = (number/100)%10;
	int digit4 = (number/10)%10;
	int digit5 = number%10;

System.out.print(digit1+" "+digit2+" "+digit3+" "+digit4+" "+digit5);
}
}
}
