import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && max < number) {
                max = number;
            }
        }
        System.out.println(max);
    }
}