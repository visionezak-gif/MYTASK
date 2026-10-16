import java.util.Scanner;

public class Count{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Enter a number(-1 to stop)");
	
	int sum = 0;
	
	while (true){
	
	System.out.print("Enter a number: ");
	
	int number = input.nextInt();
	
	if (number == -1){
	break;
	}
	sum+=number;

	}
	
	
	System.out.println(sum);
	
	}

}
