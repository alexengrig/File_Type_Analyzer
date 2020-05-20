import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();
        final int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; array.length - i >= 3; i++) {
            final int one = array[i];
            final int two = array[i + 1];
            final int three = array[i + 2];
            if (two - one == 1 && three - two == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}