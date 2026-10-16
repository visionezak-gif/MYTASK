import java.util.Scanner;
public class NumbersCheck{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int number = input.nextInt();
	
	//System.out.print("Enter your second number: ");
	//int secondNumber = input.nextDouble();
	
	if(number % 2 == 0){
	System.out.println("Even number");
	}
	
	if (number % 2 != 0){
	System.out.println("Odd number");
	}
	
//	else if (number ==0){
//	System.out.println("Zero value");
//	}
	
	//System.out.println("The average is = " + average);
	
	
	}
	
}
