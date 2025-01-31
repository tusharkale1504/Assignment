import java.util.Scanner;
import java.util.HashSet;

public class HappyNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isHappyNumber(num)) {
            System.out.println(num + " is a Happy Number.");
        } else {
            System.out.println(num + " is an Unhappy (Sad) Number.");
        }
        scanner.close();
    }

    public static boolean isHappyNumber(int num) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        while (num != 1 && !seenNumbers.contains(num)) {
            seenNumbers.add(num);
            num = sumOfSquares(num);
        }

        return num == 1;
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
