import java.util.Scanner;
import java.util.Arrays;
public class ArrayLearning{

	public static void main(String[] args){

	 int [] numbers = new int[4];
	
	 
	 for (int index = 0; index <numbers.length; index++){
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number at index " + index + ": ");
	int userInput = input.nextInt();
	
			
	 	numbers[index] = userInput;
	 }
	
	System.out.println(Arrays.toString(numbers));
	
	}
	
 }


