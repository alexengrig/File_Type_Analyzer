import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        for (int i : array) {
            if (i == number) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}