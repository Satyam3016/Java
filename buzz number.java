import java.util.Scanner;

public class BuzzNumber {


   public static boolean isBuzz(int number) {

      if( number%10 == 7 || number%7 == 0) 
         return true;

     
      return false;
   }

   public static void main(String[] args) {

     
      int number = 0;

     
      Scanner scan =  new Scanner(System.in);
      System.out.print("Enter an integer number:: ");
      number = scan.nextInt();

     
      if(isBuzz(number))
         System.out.println(number+" is a"
		    	+ " buzz number");
      else
         System.out.println(number+" is not a"
	      	  	+ " buzz number");

      
      scan.close();
   }
}