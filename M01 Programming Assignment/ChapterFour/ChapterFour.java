import java.util.Scanner;

public class ChapterFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employees name : ");
        String name = input.next();
        System.out.print("Enter number of hours worked a week : ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay : ");
        double hourlyPay = input.nextDouble();
        System.out.print("Enter federal tax rate : ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax rate : ");
        double stateTax = input.nextDouble();

        double grossPay, federal, state, totalDeduction;
        System.out.println(
                "Employee Name: " + name +
                        "\nHours Worked: " + hoursWorked +
                        "\nPay Rate: $" + hourlyPay +
                        "\nGross Pay: $" + (grossPay = hoursWorked * hourlyPay) +
                        "\nDeductions:\n   Federal Witholding (20.0%): $" +
                        (federal = grossPay * federalTax) +
                        "\n   State Witholding (9.0%): $" + (state = grossPay * stateTax) +
                        "\n   Total Deduction: $" + (totalDeduction = federal + state) +
                        "\nNet Pay: $" + (grossPay - totalDeduction));

    }
}