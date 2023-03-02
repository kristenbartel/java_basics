package decision_structures;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args){
//        init quota
        int quota = 10;

//        get values for the unknown
        System.out.println("HOw many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota) System.out.println("Congrats on meeting your quota!");

        else{
            int salesShort = quota - sales;
        System.out.println("You did not meet your quota. You were " + salesShort + " sales short.");
        }
//
    }
}
