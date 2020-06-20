import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            swap(array, from, to);
        }
        System.out.println(String.join(" ", array));
    }

    private static void swap(String[] array, int from, int to) {
        String buffer = array[from];
        array[from] = array[to];
        array[to] = buffer;
    }
}