public class SmallestNumber{

	public static void main(String[] args){
	
	int [] numbers = {12, 45, 7, 89, 23, 56};
	
	int Smallest = numbers[0];
	for(int index = 0; index < numbers.length; index++){
	
	if (numbers[1] < Smallest){
	Smallest = numbers[1];
	}
	
	if (numbers[2] < Smallest){
	Smallest = numbers[2];
	}
	
	if (numbers[3] < Smallest){
	Smallest = numbers[3];
	}
	
	if (numbers[4] < Smallest){
	Smallest = numbers[4];
	}
	
	if (numbers[5] < Smallest){
	Smallest = numbers[5];
	}
	

	}
	
	

	
	System.out.println(Smallest);
   }
	
}
