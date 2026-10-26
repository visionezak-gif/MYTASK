public class Sumation{


	public static int twoSum(int number){
	
	
	
	if(number == 0){
		return 0;
	}
	else if (number % 9 == 0){
		return 9;
	}
	
	else{
		return number % 9;
	}
	
	
	}
	
	public static void main(String[] args){
	int result = twoSum(777);
	System.out.println(result);
	}

}
