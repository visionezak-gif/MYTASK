public class Largest{

	public static void main(String[] args){
	
	int [] numbers = {12, 45, 7, 89, 23, 56};
	
	int largest = numbers[0];
	for(int index = 0; index < numbers.length; index++){
	
	if (numbers[1] > largest){
	largest = numbers[1];
	}
	
	if (numbers[2] > largest){
	largest = numbers[2];
	}
	
	if (numbers[3] > largest){
	largest = numbers[3];
	}
	
	if (numbers[4] > largest){
	largest = numbers[4];
	}
	
	if (numbers[5] > largest){
	largest = numbers[5];
	}
	

	}
	
	

	
	System.out.println(largest);
   }
	
}
