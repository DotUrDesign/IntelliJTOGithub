/*
        Create a class "Game", which allows a user to play "Guess the number" game once. Game should have the following methods:
        1) Constructor to generate  the random number.
        2) takeUserInput() to take a user input of number.
        3) isCorrectNumber() to detect whether the number entered by the user is true.
        4) getter and setter for numOfGuesses.
        Use properties such as noOfGuesses(int), etc to get this task done!
*/

import java.util.*;
class Game {
    int number;
    int noOfGuesses;
    int userInput;
    int min, max;
    public Game()
    {
        min = 1;
        max = 100;
        noOfGuesses = 1;
        number = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println(number);
        noOfGuesses = 0;
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number within the range of " + min + " and " + max);
        userInput = sc.nextInt();
        while(userInput < min || userInput > max) {
            System.out.println("Invalid input");
            userInput = sc.nextInt();
        }
    }

    public int isCorrectNumber()
    {
        // if the original number is greater than the user's input, then this function will return 1, if smaller, then -1 and if equal then 0.
        if(number == userInput)
            return 0;
        else if(number > userInput) {
            noOfGuesses++;
            min = userInput + 1;
            return 1;
        }
        else {
            noOfGuesses++;
            max = userInput - 1;
            return -1;
        }
    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
}
public class CWH_43_Q1 {
    public static void main(String[] args) {
        Game user1 = new Game();
        while(true)
        {
            user1.takeUserInput();
            int value = user1.isCorrectNumber();
            if(value == 0)
                break;
            System.out.println("Valid guesses till now : " + user1.getNoOfGuesses());
        }
        System.out.println("Your total number of valid guesses were : " + (user1.getNoOfGuesses() + 1));
    }
}
