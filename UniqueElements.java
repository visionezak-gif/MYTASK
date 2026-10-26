public class UniqueElements{

	public static void main(String[] args){
	
	int[] numbers = {1, 6, 1, 2, 4, 9, 1, 1};
	int sum = 0;

	for (int index = 0; index < numbers.length; index++) {
	    int count = 0;

	    for (int checker = 0; checker < numbers.length; checker++) {
		  if (numbers[index] == numbers[checker]) {
		      count++;
		  }
	    }

	    if (count == 1) {
		  sum += numbers[index];
	    }
	}

	System.out.println(sum);
	
	
	
	}

	
}
