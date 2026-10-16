import java.util.Scanner;
public class NameAndAge{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Enter your second number: ");
	int secondNumber = input.nextInt();
	
	int sum = firstNumber + secondNumber;
	
	System.out.print("Total sum =: " + sum);
	
	
	}
	
}
	

