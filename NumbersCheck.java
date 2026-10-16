import java.util.Scanner;
public class NumbersCheck{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int number = input.nextInt();
	
	//System.out.print("Enter your second number: ");
	//int secondNumber = input.nextDouble();
	
	if(number < 0){
	System.out.println("Negative value");
	}
	
	if (number >0){
	System.out.println("Positive value");
	}
	
	else if (number ==0){
	System.out.println("Zero value");
	}
	
	//System.out.println("The average is = " + average);
	
	
	}
	
}
