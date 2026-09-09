import java.util.Scanner;

public class MadLibWithMethod
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an animal: ");
        String animal = input.nextLine();

        System.out.print("Enter a number: ");
        String number = input.nextLine();

        System.out.print("Enter a direction: ");
        String direction = input.nextLine();


       System.out.println();
        displayMadLib(animal, number, direction);

        input.close();
    }

    public static void displayMadLib(String animal, String number, String direction)
    {
        System.out.println("Hickory Dickory Dock,");
        System.out.println("The " + animal + " ran up the clock.");
        System.out.println("The clock struck " + number + ".");
        System.out.println("The " + animal + " ran " + direction + ".");
        System.out.println("Hickory Dickory Dock.");
    }
}
    