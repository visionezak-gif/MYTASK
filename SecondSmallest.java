import java.util.Scanner;
public class SecondSmallest{

	public static void main(String[] args){
	
	
	Scanner input = new Scanner (System.in);
	System.out.print("Enter a number: ");
	int number1 = input.nextInt();
	
	System.out.print("Enter a number: ");
	int number2 = input.nextInt();
		
	System.out.print("Enter a number: ");
	int number3 = input.nextInt();
	
	System.out.print("Enter a number: ");
	int number4 = input.nextInt();
	
	System.out.print("Enter a number: ");
	int number5 = input.nextInt();
		
		int smallest = number1;
		
	if (number2 < smallest){
	 smallest = number2;
	}
	if (number3 < smallest){
	 smallest = number3;
	}
	if (number4 < smallest){
	 smallest = number2;
	}
	if (number5 < smallest){
	 smallest = number3;
	}
	
	System.out.println(smallest);
	
	}

}
