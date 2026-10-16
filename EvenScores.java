import java.util.Scanner;

public class EvenScores{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	int index = 1;
	
	while(index <= 10){
	
	System.out.print("Enter score" + index + ":");
	
	int score = input.nextInt();
	
 		if (score % 2 ==0){
 		sum+=score;
 		
 		}
		index++;
	
		}
	
	System.out.println("Sum of even numbers are = " + sum);
	}

}
