import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Clean up the following code by adding comments where appropriate.
// If you read the program carefully you should be able to follow it. Also, rename variables and methods to be meaningful and consistent.
        Scanner keyboard = new Scanner(System.in);
        double loan = 0;
        double intrest= 0;
        double monthlyPayment =0;
        double payment = 0;
        double balance = 0;
        int term;

        System.out.printf("Enter the loan amount: ");
        loan = keyboard.nextDouble();


        System.out.printf("Enter the interest rate on the loan: ");
        intrest = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        term = keyboard.nextInt();

        System.out.printf("\n======================================");
        keyboard.close();

        monthlyPayment= getMonthlyPayment(loan, intrest, term);
        balance = -(monthlyPayment*(term*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ",monthlyPayment );
    }


    public static double getMonthlyPayment(double loan, double interst, int term) {
        double rate = (interst / 100) / 12;
        double base = (rate + 1);
        double months = term * 12;
        double result = 0.0;
        result = 1* (rate * (Math.pow(base, months)) / Math.pow(base, months));

        return result;
    }
}