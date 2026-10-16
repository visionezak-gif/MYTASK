		//Positive values
		//Negative values
		//Zero values

public class PositiveValues{

	public static void main(String[] args){
	
	
	int [] numbers = {-5, 10, 0, 7, 0, 15, -8};
	
	int negativeCount = 0;
	int positiveCount = 0;
	int zeroCount = 0;
	
	for(int index = 0; index < numbers.length; index++){
	 if(numbers[index] < 0){
	 negativeCount++;	
	 }
	  if (numbers[index] > 0){
	  positiveCount++;
	  }
	    
	    else if(numbers[index] == 0){
	    zeroCount++;
	    }
	    
	}
	 System.out.println("Negative value = " + negativeCount);
	 System.out.println("positive value = "+ positiveCount);
	 System.out.println("Zero value = "+ zeroCount);
	}


}
