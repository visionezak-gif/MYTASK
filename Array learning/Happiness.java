import java.util.Scanner;
public class Happiness {

	
	
	public static double gradeAverage(){
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter the number: ");
			 double firstNumber = input.nextDouble();
			
			System.out.print("Enter the number: ");
			double secondNumber = input.nextDouble();
			
			double total = firstNumber + secondNumber;
			double average = total / 2;
			
			
			 
			if (average > 76.2) {
			System.out.println("Proficient");
			}
			else if (average >= 50 && average == 76.2) {
			System.out.println("You're getting there");
			}
			else {
			System.out.println("Get better");
			}
		
				return average;
					
				}
			
			
		public static void main(String... args) {
		
		double result = gradeAverage();
		
		System.out.println("your grade is: " + result);	
			
			
		
	}
}
