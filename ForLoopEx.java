public class ForLoopEx{
	public static void main(String[] args){

    
    byte[] price={10,20,30,40,50,60,70,80,90,100};

	int[] intensive={10000,15000,10800,15500,43000,34000,7500,3400,12000,34509};

	float[] velocity={12.3f,3.4f,5.6f,2.6f,3.7f,6.9f,9.5f,3.7f,8.6f,5.4f};

	String[] states={"Karnataka","Maharastra","Kerala","Tamilnadu","Punjab","Gujrat","Odisha","Sikkim","Jammu & Kashmir","Andhra Pradesh"};

    boolean[] isFemale={true,false,true,false,false,true,false,true,true,false};

    System.out.println("......................................From Left To Right..........................................");



    for(int i = 0; i < 9; i++){

    	System.out.println(price[i]);
    	System.out.println(intensive[i]);
    	System.out.println(velocity[i]);
    	System.out.println(states[i]);
    	System.out.println(isFemale[i]);
    }


    System.out.println("......................................From Right To Left..........................................");


    for(int j = 9; j >= 0; j--){

        System.out.println(price[j]);
    	System.out.println(intensive[j]);
    	System.out.println(velocity[j]);
    	System.out.println(states[j]);
    	System.out.println(isFemale[j]);
    	
    }


    System.out.println(".......................................From Middle TO Left................................................");

    for(int k = 5; k < 9; k++){

    	System.out.println(price[k]);
    	System.out.println(intensive[k]);
    	System.out.println(velocity[k]);
    	System.out.println(states[k]);
    	System.out.println(isFemale[k]);


    }


    System.out.println("......................................From Left To Middle................................");

    for(int m = 0; m < 5; m++){

    	System.out.println(price[m]);
    	System.out.println(intensive[m]);
    	System.out.println(velocity[m]);
    	System.out.println(states[m]);
    	System.out.println(isFemale[m]);

    }


    System.out.println(".......................................Skipping One Element...............................");

    for(int n = 0; n < 9; n=n+2){

    	System.out.println(price[n]);
    	System.out.println(intensive[n]);
    	System.out.println(velocity[n]);
    	System.out.println(states[n]);
    	System.out.println(isFemale[n]);
    	
    }

  }
}
