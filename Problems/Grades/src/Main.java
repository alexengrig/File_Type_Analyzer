import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int d = 0, c = 0, b = 0, a = 0;
        for (int i = 0; i < count; i++) {
            int grade = scanner.nextInt();
            switch (grade) {
                case 5:
                    a++;
                    break;
                case 4:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 2:
                    d++;
                    break;
            }
        }
        System.out.println(Stream.of(d, c, b, a).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}