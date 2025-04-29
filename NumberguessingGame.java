import java.util.Scanner;
public class NumberguessingGame{
    public static void main(String[]args){
                   int number = (int)(Math.random()*100)+1;
                   Scanner input = new Scanner(System.in);
		   int userguess = 0;
		   int attempts = 0;
		   
		 while(userguess != number){
		  System.out.println("Enter a number between 1 to 100 to start the game");
		 userguess = input.nextInt();
                  attempts++;
		 if (userguess < number){
		 System.out.println("Too low! try again.");
			}else if (userguess > number){
		System.out.println("Too high! try again");
			}else{
		System.out.println("Congratulations! You guessed it right");
		System.out.println("It took you"+ attempts +"attempts to guess");
			}
		}
    }
}