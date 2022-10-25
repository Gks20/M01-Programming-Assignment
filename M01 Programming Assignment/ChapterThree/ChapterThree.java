import java.util.Scanner;

public class ChapterThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // generate random number
        int lottery = (int) (Math.random() * 1000);

        // input three numbers
        System.out.print("Enter a three digit number : ");
        int guess = input.nextInt();

        int lotto1 = lottery / 100;
        int remain_num = lottery % 100;
        int lotto2 = remain_num / 10;
        int lotto3 = remain_num % 10;

        int input1 = guess / 100;
        int remaining_num = guess % 100;
        int input2 = remaining_num / 10;
        int input3 = remaining_num % 10;

        System.out.println("The winning number is " + lottery);

        if (guess == lottery)
            System.out.println("It's a match - YOU WON $10,000");
        if (input1 == lotto2) {

        }

    }
}