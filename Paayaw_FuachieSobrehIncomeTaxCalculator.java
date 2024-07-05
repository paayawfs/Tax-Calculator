import java.util.Scanner;

public class Paayaw_FuachieSobrehIncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your gross income. The program will print out your net income: ");
        double grossIncome = input.nextDouble();
        System.out.println(IncomeTax(grossIncome));  // Call the IncomeTax method and print the result
    }

    public static double IncomeTax(double grossIncome) {
        double firstBracket = 402.0;                    /* Initialization of brackets*/
        double secondBracket = 110.0;
        double thirdBracket = 130.0;
        double fourthBracket = 3000.0;
        double fifthBracket = 16395.0;
        double sixthBracket = 29963.0;
        double tax = 0;

        if (grossIncome <= firstBracket) {               /* For non taxable income*/
            return grossIncome;
        }

        double taxableAmount = grossIncome - firstBracket;           // Calculate the taxable amount by subtracting the first bracket

        if (taxableAmount >= secondBracket) {                  /* Checks if the taxable income is more than the bracket. If it is it updates tax*/
            tax = tax + 5.5;                                   /* If it is less than the bracket it updates tax by calculating the percentage*/
            taxableAmount = taxableAmount - secondBracket;
        } else if (taxableAmount < secondBracket) {
            tax = tax + (0.05 * taxableAmount);
            return grossIncome - tax;
        }

        if (taxableAmount >= thirdBracket) {
            tax = tax + 13;
            taxableAmount = taxableAmount - thirdBracket;
        } else if (taxableAmount < thirdBracket) {
            tax = tax + (0.1 * taxableAmount);
            return grossIncome - tax;
        }

        if (taxableAmount >= fourthBracket) {
            tax = tax + 525;
            taxableAmount = taxableAmount - fourthBracket;
        } else if (taxableAmount < fourthBracket) {
            tax = tax + (0.175 * taxableAmount);
            return grossIncome - tax;
        }

        if (taxableAmount >= fifthBracket) {
            tax = tax + 4098.75;
            taxableAmount = taxableAmount - fifthBracket;
        } else if (taxableAmount < fifthBracket) {
            tax = tax + (0.25 * taxableAmount);
            return grossIncome - tax;
        }

        if (taxableAmount >= sixthBracket) {
            tax = tax + 8988.90;
            taxableAmount = taxableAmount - sixthBracket;
        } else if (taxableAmount < sixthBracket) {
            tax = tax + (0.3 * taxableAmount);
            return grossIncome - tax;
        }

        if (taxableAmount > 0) {
            tax = tax + (0.35 * taxableAmount);
        }

        double netIncome = grossIncome - tax;

        return netIncome;
    }
}