/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2019
 * Created for: ICS4U
 * This program plays a game, where the program chooses a number from 1 to 6
 * and the user tries to guess what the number is
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {

    Random rand = new Random();
    Scanner userInput = new Scanner(System.in);

    // Variables

    // This will give a range from 0 - 5
    int randomNumber = rand.nextInt(6);
    int userGuess;
    int counter;
    
    //Add one so that the range is from 1 - 6 
    randomNumber += 1;
    counter = 0;

    // Asks the user what the number is
    System.out.print("What is the secret number? (Range of 1 - 6) : ");
    userGuess = userInput.nextInt();

    // Repeats this process as long as the answer is wrong
    while (randomNumber != userGuess) {

        // One more trial that you took is added to the total
        counter += 1;

        System.out.print("That number is incorrect! ");
        
        // Asks the user again  
        System.out.print(" What is the secret number? (Range of 1 - 6) : ");
        userGuess = userInput.nextInt();

        }

    // One more trial that you took is added to the total
    counter += 1;
    System.out.print("Congratulations! That is the right number! And it only took " + counter + " tries.");

    }
}
