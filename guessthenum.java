import java.util.*;
public class guessthenum {
    public static void main (String[] args)
    {Scanner sc= new Scanner(System.in);
        int number = new Random().nextInt(100)+1,guess,attempt=0, max=10;
        System.out.println("\n Guess the number from 1 to 100\n");
        while (attempt++<max)
        {guess = sc.nextInt();
            if (guess == number)
            {
                System.out.println("Correct! Attempts taken:" + attempt);
                return;
            }
            System.out.println(guess < number? "Too low !" : "Too high!");
        }
        System.out.println("Out of attempts! Number was:" + number);

    }
}
