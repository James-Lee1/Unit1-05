/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2019
 * Created for: ICS4U
 * This program plays a game, where the program chooses a number from a range
 * specified by the user and the user tries to guess what the number is
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class HardDiceRoll {
    public static void main(String[] args) {

    Random rand = new Random();
    Scanner userInput = new Scanner(System.in);

    // Variables
    int maxRange;

    // Asks user for upper bound of range
    System.out.print("What is the maximum range? : ");
    maxRange = userInput.nextInt();

    int randomNumber = rand.nextInt(maxRange);
    int userGuess;
    int counter;

    //Add one so that the range has a lower bound of 1 and upper bound of the user's preference
    randomNumber += 1;
    counter = 0;

    // Asks the user what the number is
    System.out.print("What is the secret number? (Range of 1 - " + maxRange + "? : ");
    userGuess = userInput.nextInt();

    // Repeats this process as long as the answer is wrong
    while (randomNumber != userGuess) {

        // One more trial that you took is added to the total
        counter += 1;

        System.out.print("That number is incorrect! ");

        // Asks the user again
        System.out.print("What is the secret number? (Range of 1 - " + maxRange + "? : ");
        userGuess = userInput.nextInt();

        }

    // One more trial that you took is added to the total
    counter += 1;

    if (counter == 1) {

        System.out.print("Congratulations! That is the right number! And it only took " + counter + " try.");

    } else {

        System.out.print("Congratulations! That is the right number! And it only took " + counter + " tries.");

        }
    }
}
