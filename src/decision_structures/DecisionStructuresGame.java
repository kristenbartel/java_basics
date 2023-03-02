package decision_structures;

import java.util.Scanner;

public class DecisionStructuresGame {

    public static void main(String[] args){
        System.out.println("Let's count your change to see if you have " +
                "exactly one dollar");

        double pennyValue = 0.01;
        double nickleValue = 0.5;
        double dimeValue = 0.10;
        double quarterValue = 0.25;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of pennies");
        int numberOfPennies = scanner.nextInt();
        System.out.println("enter the number of nickels");
        int numberOfNickles = scanner.nextInt();
        System.out.println("enter the number of dimes");
        int numberOfDimes = scanner.nextInt();
        System.out.println("enter the number of quarters");
        int numberOfQuarters = scanner.nextInt();

        scanner.close();


        double totalValue =
                (numberOfPennies * pennyValue) + (numberOfNickles * nickleValue) + (numberOfDimes * dimeValue) + (numberOfQuarters * quarterValue);
        System.out.println(totalValue);

        String resultMessage;

        if(totalValue < 1.00){
            double difference = 1.00 - totalValue;
            resultMessage =
                    "you have a total amount of " + totalValue + " and a " +
                            "deficit of " + difference;
        } else if (totalValue > 1.00) {
            double difference = totalValue - 1.00;
            resultMessage =
                    "You have a total value of " + totalValue + " and a " +
                            "surplus of " + difference;
        } else resultMessage = "you have exactly one dollar.";

        System.out.println(resultMessage);
    }

}
