import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);
        System.out.println(numbers.get(count - 1) * numbers.get(count - 2));
    }
}