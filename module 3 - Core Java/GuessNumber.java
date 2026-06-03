import java.util.Scanner;

class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100");

        while(guess != randomNumber)
        {
            System.out.println("Enter your guess:");
            guess = sc.nextInt();

            if(guess > randomNumber)
            {
                System.out.println("Too High");
            }
            else if(guess < randomNumber)
            {
                System.out.println("Too Low");
            }
            else
            {
                System.out.println("Correct! You guessed the number.");
            }
        }
    }
}