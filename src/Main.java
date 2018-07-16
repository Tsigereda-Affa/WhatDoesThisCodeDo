import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Clean up the following code by adding comments where appropriate.
// If you read the program carefully you should be able to follow it. Also, rename variables and methods to be meaningful and consistent.
        Scanner keyboard = new Scanner(System.in);
        double num1 = 0;
        double num2= 0;
        double num3 = 0;
        double payment = 0;
        int cp = 0;
        int trm;

        System.out.printf("Enter the loan amount: ");
        num1 = keyboard.nextDouble();


        System.out.printf("Enter the interest rate on the loan: ");
        num2 = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        trm = keyboard.nextInt();

        System.out.printf("\n======================================");
        keyboard.close();

        num3 = getMonthlyPayment(num1, num2, trm);
        payment = -(num3*(trm*12));
        System.out.format( "Balance owed to bank: ");
        System.out.format( "Minimum monthly payment: ");
    }


    public static double getMonthlyPayment(double numl, double num2, int trm) {
        double rate = (num2 / 100) / 12;
        double base = (rate + 1);
        double months = trm * 12;
        double result = 0.0;
        result = 1* (rate * (Math.pow(base, months)) / Math.pow(base, months));

        return result;
    }
}