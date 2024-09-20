import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void fizz_Buzz() {

        try {
            fizz_Buzz_Loop();
        }
        catch (InputMismatchException e){
            System.out.println("Input is not a valid number! Try again: ");
            fizz_Buzz();
        }
    }
    public static void fizz_Buzz_Loop(){
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        while (number != 0){
            try {
                String say = "";
                if (number % 3 == 0) say += "Fizz";
                if (number % 5 == 0) say += "Buzz";
                System.out.println(say.isEmpty() ? Integer.toString(number) : say);
                System.out.println("\nEnter the number:");
                number = userInput.nextInt();
            }
            catch (InputMismatchException e){
//                throw new InputMismatchException();
                System.out.println("Input is not a valid number! Try again: ");
                fizz_Buzz_Loop();
            }
        }
        System.out.println("Goodbye!");
        userInput.close();
    }
}
