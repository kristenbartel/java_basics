package fill_in_the_blank;
import java.util.Scanner;

public class FillTheBlankStory {

    public static void main(String[] args) {
        System.out.println("Fill in the blanks for the following story" + "One a __ __ day, I drink __ cups of water.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an adjective");
        String adjective = scanner.next();

        System.out.println("Input a season of the year");
        String season = scanner.next();

        System.out.println("Input a number");
        int number = scanner.nextInt();

        scanner.close();

        String compiledStory = "On a " + adjective + " " + season + " day, I drink " + number + " cups of water.";

        System.out.println(compiledStory);
    }
}
