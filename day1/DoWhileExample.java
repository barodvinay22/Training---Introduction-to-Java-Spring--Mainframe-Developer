import java.util.Scanner;
import static java.lang.System.in;
public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);// in is the static object of input stream
        int secretNumber = 4;
        int guess;
        
        do {
            System.out.print("Guess the number between 1 and 5: ");
            guess = scanner.nextInt();// input 
        
            if (guess != secretNumber) {
                System.out.println("Wrong guess. Try again!");
            }
        } while (guess != secretNumber);
        
        System.out.println("Congratulations! You guessed the correct number.");
        scanner.close();
    }
}


// package 