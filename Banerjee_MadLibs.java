import java.util.Scanner;

public class Banerjee_MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Initialize scanner for user input
        System.out.println("Welcome to MadLib! Let's create a fun story together!");

        // Prompt user and read different types of words for the story
        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb1 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("Enter a plural noun: ");
        String pluralNoun1 = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb1 = scanner.nextLine();

        // Build the MadLib story string by inserting the user inputs
        String story = "Once upon a time, there was a " + adjective1 + " " + noun1 + ".\n" +
                       "Every day, it would " + verb1 + " with its friends, the " + pluralNoun1 + ".\n" +
                       "One day, they found a magical " + noun2 + " that granted wishes!\n" +
                       "They all wished " + adverb1 + " and lived happily ever after.";

        // Display the final story
        System.out.println("Here's your story: ");
        System.out.println(story);

        scanner.close();  // Close scanner resource
    }
}
