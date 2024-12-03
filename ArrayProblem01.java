public class ArrayProblem01{
	
	public static void main(String[] args){

	int[] arr={12,23,34,45,56};
	int returnedvalue=sumOfArray(arr);
	System.out.println(returnedvalue);


	}

	public static int sumOfArray(int[] arr){
     
    int total=0;
	for(int i = 0; i < arr.length; i++){
	total=total+arr[i];

	}
	System.out.println("sum of array:"+total);
	return total;
	}
}
