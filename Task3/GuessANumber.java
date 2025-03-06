
import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	   System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){	
        Scanner s = new Scanner(System.in); 
       
         if(!s.hasNextInt()) {
            System.out.println("Write a valid number please");
            s.next();
            makeAGuess();
            return;
        } 

        int input = s.nextInt();

        if(input < 1 || input > 100) {
            System.out.println("Number must be between 1 and 100");
            makeAGuess();
             return;
        }

        
        if (input > rnd_number) {
                System.out.println("You have guess to high! Try again but lower"); 
                makeAGuess();   
         }   else if (input < rnd_number) {
                     System.out.println("You have guess to low! Try again but higher");  
                     makeAGuess();  
         }   else {
                System.out.println("You guessed it! The number was: " + rnd_number);
                
             }   
    }
}

