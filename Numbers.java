import java.util.Scanner;

public class Numbers{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);


		int looptime = 1;
		while(true){
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if (number == 0){
		break;

		}else


		looptime++;
		System.out.println(number);		
		}




		}

	}
