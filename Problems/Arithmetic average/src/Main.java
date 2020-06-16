import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        double sum = 0;
        double count = 0;
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum / count);
    }
}