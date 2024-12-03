public class ArrayProblem02{
	public static void main(String[] args){



	int[] array={1,2,5,1,5,2,1,3,5};

	int result=findOccurance(array,1);

	System.out.println("num is:"+result);


	
	}


	public static int findOccurance(int[] array, int input){

	   int num=0;

	   for(int i = 0; i < array.length; i++);{

	       if(array[0] == input){
	            num++;
	

	       }
	
	   
	   }
	   
	   return num;
	

	} 

}