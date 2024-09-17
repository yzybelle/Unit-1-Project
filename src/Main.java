import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // This chunk of code asks the user for the price of the bill, parses it into a double and assigns it to the variable bill.
        Scanner myObj = new Scanner(System.in);
        System.out.print("How much is the bill? ($) ");
        String input1 = myObj.nextLine();
        double bill = Double.parseDouble(input1);


        // This chunk of code asks the user for the tip percentage as an integer, changes it into a double, and then mathematically makes it a decimal (percentage)
        Scanner myObjA = new Scanner(System.in);
        System.out.print("What is the tip percentage? ");
        String input2 = myObjA.nextLine();
        double percent = Double.parseDouble(input2);
        final double tipPercentage = percent/100;  // Then it assigns it into tipPercentage.

        // This code asks the user for how many people are in their party and assigns it into a variable called persons.
        Scanner myObjB  = new Scanner(System.in);
        System.out.print("How many people in your party? ");
        String input3 = myObjB.nextLine();
        int persons = Integer.parseInt(input3);

        // This calculates the total print amount and prints it.
        double totalTipAmount = bill*tipPercentage;
        System.out.print("Total Tip Amount: $");
        System.out.printf("%.2f", totalTipAmount);
        System.out.println();

        // This calculates the total bill cost and prints it.
        double totalBillCost = bill + totalTipAmount;
        System.out.print("Total Bill Cost: $");
        System.out.printf("%.2f", totalBillCost);
        System.out.println();

        // This calculates the total tip per person and prints it.
        double tipPerPerson = totalTipAmount/persons;
        System.out.print("Tip Per Person: $");
        System.out.printf("%.2f", tipPerPerson);
        System.out.println();

        // This calculates the total bill per person and prints it.
        double totalBillPerPerson = totalBillCost/persons;
        System.out.print("Total Bill Per Person: $");
        System.out.printf("%.2f", totalBillPerPerson);
        System.out.println();








    }
}
