import java.util.Scanner;

public class Calculation{

	public static void main(String[] args){

			
				Scanner input = new Scanner(System.in);
				
			
			int sum = 0;
			int looptime = 1;
			while(looptime <= 5){
				 System.out.print("Enter a number" + looptime + ": ");
				int number = input.nextInt();
				
				
			sum += number;
			
			
			
			looptime++;
				
		}
						
			System.out.println(sum);
	
	
	}

}
