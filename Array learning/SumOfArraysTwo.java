public class SumOfArraysTwo{


	public static int totalOfNumbers(int[] numbers){
	
	
	
	int sum = 0;
	
	
	for (int index = 0; index < numbers.length; index++){
		sum = sum + numbers[index];
	}
	
	return sum;
	
	}


public static float averageOfNumbers(int total, int length){

	float average = 0;

	average = total/length;
	
	return average;

}



public static void main(String[] args){
	int [] numbers = {90, 70, 80, 98};
	int total = totalOfNumbers(numbers);
	
	float average = averageOfNumbers(total, numbers.length);
	
	System.out.println("Total sum is = " + total);
	
	System.out.println("Total average is = " + average);
	
	
	
	}

}
