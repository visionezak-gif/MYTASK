public class IndexSwap{
	
	
	
	public static int[] sortThis(int[] array){
	

	array[0] = 7;
	array[1] = 6;
	array[2] = 5;
	array[3] = 4;
	array[4] = 2;
	
	for(int index = 0; index < array.length; index++){
	System.out.print(array[index] +" ");
	}
	
	return array;
	
	
	
	}
	public static void main(String[] args) {
	
	int[]numbers = {5, 7, 2, 4, 6};
	
	sortThis(numbers);
 }
 
}
