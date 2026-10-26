import java.util.Scanner;
public class NumbersCheck{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int number = input.nextInt();
	
	System.out.print("Enter second number: ");
	int number2 = input.nextInt();
	
	int largest = number;
	
	if(number2 > largest){
	largest = number2;
	
	}
	System.out.println("Largest number = " + largest);
	

	}
	
}
