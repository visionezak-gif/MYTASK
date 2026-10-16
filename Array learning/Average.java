public class ElementThree{
	public static void main(String[] args) {
	
	int []numbers = {10, 20, 30, 40, 50};
	
	int sum = 0;
	double average = 0;
	for (int index = 0; index < numbers.length; index++){
		sum = sum + numbers[index];
		
		average = sum / numbers.length;

	}
	
	System.out.println(average);
	
  
  }

	
 }
