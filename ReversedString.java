import java.util.Scanner;
//public class ReversedString{
//
//	public static void main(String[] args){
//	
//	String original = "DOG";
//	
//	String reversed = "";
//	
//	for (int index = original.length()-1; index >= 0; index--){
//		reversed = reversed + original.charAt(index);
//	
//	}
//	
//	System.out.println(reversed);
//
//			ANOTHER CODE.
//
//	Scanner input = new Scanner (System.in);
//	System.out.print("Enter a word: ");
//	
//	String word = input.nextLine();
//       String reversed = "";
//       
//       
//       for (int index = word.length()-1; index >=0; index--){
//       	reversed = reversed + word.charAt(index);
//       
//       }
//		System.out.println(reversed);
//	}
//	
//	
//}
//	


public class ReverseString{

//	public static String reversedString(String word){
//	
//	String reversed = "";
//	
//	for (int index = word.length()-1; index >=0; index--){
//		reversed = reversed + word.charAt(index);
//	}
//		return reversed;
//	
//	}
//	
//

//	
//
//	public static boolean isPalindrome(String word){
//
//	String reversed = "";
//	
//	for (int index = word.length()-1; index >=0; index--){
//		reversed = reversed + word.charAt(index);
//			
//	   }
//	   
//	   if (reversed.equals(word)){
//		return true;
//	}
//		else{
//			return false;
//		}
//	
//	
//	}
//	public static void main(String[] args){
//	boolean result = isPalindrome("maloam");
//	System.out.println(result);
//	}



	public static int countDigits(int number){
		if (number == 0){
		return 1;
		}
		
		number = Math.abs(number);
		
		int count = 0;
		
		while (number > 0){
		number = number / 10;
		
		count++;
		
		}
		
		return count;
	}
	
	public static void main(String[] args){
	int result = countDigits(-4654435);
	System.out.println(result);
	
	} 
//

//	public static int oneDigit(int numbers){
//
//		Scanner input = new Scanner (System.in);
//	System.out.print("Enter a numbere: ");
//	
//	int number = input.nextInt();
//	
//	if (numbers == 0){
//	return 0;
//	}
//	else if (numbers % 9 == 0){
//	return 9;
//	  }
//	
//	
//	else{
//	
//	 return numbers % 9;
//	}
//	
//    }
//	
//	public static void main(String[] args){
//	int result = oneDigit(123);
//	System.out.println(result);
//	}



//	public static void main(String[] args){
//	
//	System.out.println("\"Hello\"");
	
	
//	}

}




















	
