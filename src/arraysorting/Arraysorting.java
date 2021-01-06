package arraysorting;

public class Arraysorting {

//	Write a function that accepts an array and returns the sorted array.
	
	public static void main(String[] args) {
		int[] numArray = {2,6,1,3,5};
		for( int i : numArray) {
			System.out.println(i);
		}
		numArray = sortArray(numArray);
		for( int i : numArray) {
			System.out.println(i);
		}

	}
	
	
	private static int[] sortArray(int[] intArray) {
		int temp = 0;
		 for (int i = 0; i <intArray.length; i++) {     
	          for (int j = i+1; j <intArray.length; j++) {     
	              if(intArray[i] >intArray[j]) {      
	                 temp = intArray[i];    
	                 intArray[i] = intArray[j];    
	                 intArray[j] = temp;    
	               }     
	            }     
	        }
		
		
		
		return intArray;
	}

}
