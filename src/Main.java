import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // This chunk of code asks the user for the price of the bill, parses it into a double and assigns it to the variable bill
        Scanner myObj = new Scanner(System.in);
        System.out.println("How much is the bill? ($)");
        String input1 = myObj.nextLine();
        double bill = Double.parseDouble(input1);

        // This chunk of code asks the user for the tip percentage as an integer,
        Scanner myObjA = new Scanner(System.in);
        System.out.println("What is the tip percentage?");
        String input2 = myObjA.nextLine();
        double percent = Double.parseDouble(input2);
        final double tipPercentage = percent/100;



        Scanner myObjB  = new Scanner(System.in);  // This chunk of code asks the user for the amount of people in their party
        System.out.println("How many people in your party?");
        String input3 = myObjB.nextLine();
        int persons = Integer.parseInt(input3); // and then assigns their string input

        double totalTipAmount = bill*tipPercentage;
        System.out.print("Total Tip Amount: $");
        System.out.printf("%.2f", totalTipAmount);
        System.out.println();

        double totalBillCost = bill + totalTipAmount;
        System.out.print("Total Bill Cost: $");
        System.out.printf("%.2f", totalBillCost);
        System.out.println();


        double tipPerPerson = totalTipAmount/persons;
        System.out.print("Tip Per Person: $");
        System.out.printf("%.2f", tipPerPerson);
        System.out.println();

        double totalBillPerPerson = totalBillCost/persons;
        System.out.print("Total Bill Per Person: $");
        System.out.printf("%.2f", totalBillPerPerson);
        System.out.println();








    }
}
