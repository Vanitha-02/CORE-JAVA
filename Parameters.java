 public class Parameters{
     public static void main(String[] args){
     
     nature();

     animal("Tiger");
     animal("Lion");

     ball("Volly ball","Black & White");
     ball("Throw ball","Yellow & Red");

     team("Royal Challengers Banglore",12,'B');
     team("Kings XL Punjab",11,'c');

     student("Gouthami",17,14,9036435160l);
     student("Manoj",24,20,7019234429l);

     }

     public static void nature(){
     System.out.println("It is an art of god");
     }
     
     //Using One Parameter

     public static void animal(String name){
     System.out.println("Animal name:"+name);

     }

     //Using Two Parameters

     public static void ball(String name,String colour){
     System.out.println("Ball name:"+name + "," + "Ball colour:"+colour);
     }

     //Using Three Parameters
     
     public static void team(String name,int members,char batch){
     System.out.println("Team name:"+name + "," + "Team members:"+members + "," +"Team batch:"+batch);
     }

     //Using Four Parameters

     public static void student(String name,int usn,int age,long phone_no){
     System.out.println("Student name:"+name + "," +"Student usn:"+usn + "," + "Student age:"+age + "," + "Student phone_no:"+phone_no);
    

     }

  }

