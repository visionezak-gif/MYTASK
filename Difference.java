import java.util.Scanner;
public class Difference{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Enter your second number: ");
	int secondNumber = input.nextInt();
	
	int difference = firstNumber - secondNumber;
	
	System.out.println("The difference is = " + difference);
	
	
	}
	
}
