import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = scanner.nextInt();
        int index = 0;
        for (int i = 1; i < count; i++) {
            int number = scanner.nextInt();
            if (max < number) {
                max = number;
                index = i;
            }
        }
        System.out.println(index);
    }
}