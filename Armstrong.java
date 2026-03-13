import java.util.Scanner;
class Armstrong
{
    public static void main(String [] args)
    {
        int num, i,n;
        System.out.print("enter the number you want to check the armstrong or not");
        Scanner sc = new Scanner(System.in);
        sc= nextInt()

    }
}

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
