import java.util.Scanner;
public class Average{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	double firstNumber = input.nextDouble();
	
	System.out.print("Enter your second number: ");
	double secondNumber = input.nextDouble();
	
	double sum = firstNumber + secondNumber;
	
	double average = sum / 2;
	
	System.out.println("The average is = " + average);
	
	
	}
	
}
