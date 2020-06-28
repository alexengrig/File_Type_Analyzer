import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                return;
            }
        }
        System.out.println(sum);
    }
}