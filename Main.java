import java.util.Scanner;
import java.util.Random;

class Main {

  public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);  

    System.out.println("Want to play a game?");
  

        int numGuess = (int)(Math.random()*100); 
        int attempts = 0; 
        int guess;
        boolean win = false; //taken from an external code that I found

        while (win == false){ 

            System.out.println("Guess a number between 1 and 100");
            guess = scan.nextInt();
            attempts++; 

            if (guess == numGuess){
                win = true; 
                System.out.println("You win!");
                System.out.println("It took you "+ attempts + " tries.");
            }

            else if(guess < numGuess){
                System.out.println("Number is too low, try again");
            }

            else if(guess > numGuess){
                System.out.println("Number is too high, try again");
            }

        }


    } 

   
  }
