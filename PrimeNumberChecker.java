public class PrimeNunberChecker{

	public static boolean isPrime(int number){
	
		if (number < 0){
		return false;
	}
	for (int index = 2; index < number; index++){
		if (number % index == 0){
		return false;
		}
		
		
	}
	
//	else{
		return true;
//		}
	
	}
	public static void main(String[] args){
	boolean result = isPrime(7);
	
	System.out.println(result);
	
	}
	

}
