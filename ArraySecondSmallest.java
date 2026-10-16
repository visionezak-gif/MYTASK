public class ArraySecondSmallest{

	public static int number(int[] numbers){
	
	 int smallestNumber = numbers [0];
	 int secondSmallest = smallestNumber;
	for(int index = 0; index < numbers.length; index++){
	
		if (numbers[index] < smallestNumber){
			 smallestNumber = numbers[index];
		}
		if(numbers[index] < secondSmallest){
			secondSmallest = numbers[index];
		}
		
		}
		
		return secondSmallest;
		
	//return smallestNumber;
	  }
	
	
	
	public static void main(String[] args){
	int [] integer ={5, 8, 1, 89};
	int resultTwo = number (integer);
	
	int[] numbers = {5 , 8 , 1 , 89};
	int result = number(numbers);
	
	//System.out.println("Smallest number is = " + result);
	System.out.println("Second smallest is = " + resultTwo);
	}

	}


//THIS COOD IS STILL ON WORKING PROGRESS


