
import java.util.Scanner;

public class PasswordChecker{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);


		int looptime = 1;
		while(true){
		System.out.print("Enter a password: ");
		int password = input.nextInt();

		if (password != 1234567){
		System.out.print("Invalid password, please try again: ");

		}else{


		looptime++;
		System.out.println("password successful");
		break;		
		}


			}

		}

	}
