public class Operations{
	public static void main(String[] args){
     social_media();

     int result=add(10,20);
     System.out.println(result);
     int addition=add(20,30);
     System.out.println(addition);

     int solutions=sub(30,10);
     System.out.println(solutions);
     int solve=sub(50,35);
     System.out.println(solve);

     int multiplication=multi(32,65);
     System.out.println(multiplication);
     int product=multi(25,14);
     System.out.println(product);  


     int division=div(36,6);
     System.out.println(division);
     int divisible=div(76,13);
     System.out.println(divisible);
   
    }

	 public static void social_media(){
	 System.out.println("Social media is leading technology");
	 }

	 public static int add(int a,int b){
	 	int addedvalue=a+b;
	 	return(a+b);
	 }

	 public static int sub(int c,int d){
	 	int substractedvalue=c-d;
	 	return(c-d);
	 }

	 public static int multi(int value1,int value2){
	 	int multiplicatedValue=value1*value2;
	 	return multiplicatedValue;
	 }

	 public static int div(int num1,int num2){
	 	int dividedVvalue=num1/num2;
	 	return (num1/num2);
	 }
}