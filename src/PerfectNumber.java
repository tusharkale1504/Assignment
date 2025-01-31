import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();


        if (isPerfectNumber(num)) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }

        scanner.close();
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) return false;

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
