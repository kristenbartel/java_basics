package gross_calculator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

//class is all CamelCase and has code block{}
//Methods are inside classes and have code blocks{}
//every statement ends with a semicolan
//Reserved words are in orange
//dynamically typed does not need datatype declarations, statically types must be declared datatypes- needs this info for compiling
//8 primitive datatypes- whole numbers byte, short, int, long
public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
//        1. Set number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
//        2. Set hourly Rate
        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();
        scanner.close();
//        3. Multiply
        double grossPay = hours * payRate;
//        4. Display result
        System.out.println("Gross pay:" + grossPay);
    }
}
