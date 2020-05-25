import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        if (n == 0) {
            return 0;
        }
        int previous = 1, current = 1, next;
        for (long i = 2; i < n; i++) {
            next = previous + current;
            previous = current;
            current = next;
        }
        return n % 2 == 0 ? -current : current;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}