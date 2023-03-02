package decision_structures;

import java.util.Scanner;

public class IfStatement {

    public static void  main(String[] args){

//        init values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

//        get values for unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

//        If quota is =>10 then add bonus to salary
        if(sales >= quota){
            salary = salary + bonus;
        }
//        System Output
        System.out.println("Employee's pay is $" + salary);
    }
}

