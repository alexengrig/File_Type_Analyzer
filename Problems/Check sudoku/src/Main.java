import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int length = size * size;
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            HashSet<Integer> set = new HashSet<>(length, 1f);
            for (int j = 0; j < length; j++) {
                int number = scanner.nextInt();
                if (number < 1 || number > length) {
                    System.out.println("NO");
                    return;
                }
                set.add(number);
                matrix[i][j] = number;
            }
            if (set.size() != length) {
                System.out.println("NO");
                return;
            }
        }
        for (int i = 0; i < length; i++) {
            HashSet<Integer> set = new HashSet<>(length, 1f);
            for (int j = 0; j < length; j++) {
                set.add(matrix[j][i]);
            }
            if (set.size() != length) {
                System.out.println("NO");
                return;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                HashSet<Integer> set = new HashSet<>(length, 1f);
                for (int k = i * size; k < (i + 1) * size; k++) {
                    for (int m = j * size; m < (j + 1) * size; m++) {
                        set.add(matrix[k][m]);
                    }
                }
                if (set.size() != length) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}