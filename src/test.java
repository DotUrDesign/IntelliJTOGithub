import java.util.Scanner;

class Game23{
    int originalNum;
    int userInput;
    int min, max;
    int guesses = 0;
    public Game23()
    {
        min = 1;
        max = 100;
        originalNum = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println(originalNum);
    }

    // takeUserInput
    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid input between " + min + " and " + max);
        userInput = sc.nextInt();
        while(userInput < min || userInput > max){
            System.out.println("Invalid guess! Enter a valid input between " + min + " and " + max);
            userInput = sc.nextInt();
        }
        guesses++;
        System.out.println("total number of guesses till now = " + guesses);
        return userInput;
    }

    // isCorrectNumber
    public int correctNumber(int userInput){
        if(userInput == originalNum)
            return 0;
        else if(userInput > originalNum) {
            max = userInput - 1;
            return 1;
        }
        else {
            min = userInput + 1;
            return -1;
        }
    }

    // no of Guesses
    public void numOfGuesses(){
        System.out.println("Total number of valid guesses = " + guesses);
    }
}

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game23 game = new Game23();
        while(true)
        {
            int input = game.takeUserInput();
            int value = game.correctNumber(input);
            if(value == 0)
                break;
        }
        game.numOfGuesses();
    }
}
