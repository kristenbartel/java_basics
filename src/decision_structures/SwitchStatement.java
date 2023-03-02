package decision_structures;

import java.util.Scanner;
//user enters grade and returns a conditional message using a switch statement.
public class SwitchStatement {
    public static void main(String[] args){

        System.out.println("Enter your grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch (grade){
            case "A":
            case "a":
                message = "excellent job";
                break;
            case "B": message = "good job";
                break;
            case "C": message = "nice work";
                break;
            default: message = "error: grade out of scope";
                break;
        }
        System.out.println(message);
    }
}
//if you eliminate the break it is called a fall through-- executions will
// continue until a break. If we want to share a message then you can
// create a fall through.
