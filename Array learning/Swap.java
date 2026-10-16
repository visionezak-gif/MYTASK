import java.util.Scanner;
public class Swap{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();
	
	int thirdNumber = firstNumber;
	
	firstNumber = secondNumber;
	secondNumber = thirdNumber;
	
	System.out.println("\n After swapping");
	System.out.println(firstNumber);
	System.out.println(secondNumber);
	
	}

}
