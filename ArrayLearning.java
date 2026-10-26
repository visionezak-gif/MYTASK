import java.util.Scanner;
import java.util.Arrays;
public class ArrayLearning{

	public static void main(String[] args){
//	 int [] numbers = new int[4];
//	
//	 
//	 for (int index = 0; index <numbers.length; index++){
//		
//	Scanner input = new Scanner(System.in);
//	System.out.print("Enter number at index " + index + ": ");
//	int userInput = input.nextInt();
//	
//			
//	 	numbers[index] = userInput;
//	 }
//	
//	System.out.println(Arrays.toString(numbers));


	String [][] contacts = new String [3][3];
	
	for (int row = 0; row < contacts.length; row++){
	
		for(int colums = 0; colums <contacts[row].length; colums++){
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter contact details at index " + colums + ": ");
			String userInput = input.nextLine();
			
			contacts[row][colums] = userInput;
		}
	
		
	}

	
	System.out.println(Arrays.deepToString(contacts));
	
	
	String managementmenu = """
	
=========================================
       CONTACT MANAGEMENT
=========================================
""";
System.out.println(managementmenu);

for (int rows = 0; rows < contacts.length; rows++){
	
		System.out.println((rows + 1) +". "+ contacts[rows][0]);	
		
	  }
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Select contact number to view details: ");
	  
	  int rows = input.nextInt();
	  
	  String design = """
-----------------------------------------
        CONTACT DETAILS
-----------------------------------------
""";

System.out.println(design);

	
		
			//switch(selectedOption){
			String[] format = {"Name: " , "Phone: " , "Email: "};
			
		for(rows = rows - 1; rows < contacts.length; rows++){
			for (int colums = 0; colums < contacts[rows].length; colums++){
			System.out.println(format[colums] + contacts[rows][colums]);
			
//		case 1: System.out.println(contacts[0][0]);
//
//		break;
//
//
//	
//
//		case 2: System.out.println(contacts[1][1]);
//		break;
//		
//		
//		
//		case 3: System.out.println(contacts[2][2]);
//		break;
//				}
	

			}
			System.out.println();
			break;

		
	      }

		



	}

}
