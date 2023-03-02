package decision_structures;

import java.util.Scanner;

public class SwitchExpressions {

    public static void main(String[] args){

        System.out.println("Enter your grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade){
            case "A", "a" -> "excellent job";
            case "B", "b" -> "good job";
            case "C", "c" -> "nice work";
            default -> "error: grade out of scope";
        };
        System.out.println(message);
    }
}
