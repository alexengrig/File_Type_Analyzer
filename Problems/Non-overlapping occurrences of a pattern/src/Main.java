import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();
        String text = scanner.nextLine();
        if (pattern.isEmpty()) {
            System.out.println(1);
            System.out.println(0);
            return;
        }
        int[] prefixFunction = new int[pattern.length()];
        char ch;
        int length;
        for (int i1 = 1, l = prefixFunction.length; i1 < l; i1++) {
            ch = pattern.charAt(i1);
            length = prefixFunction[i1 - 1];
            while (length > 0 && ch != pattern.charAt(length)) {
                length = prefixFunction[length - 1];
            }
            if (ch == pattern.charAt(length)) {
                prefixFunction[i1] = length + 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < text.length(); i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = prefixFunction[j - 1];
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j += 1;
            }
            if (j == pattern.length()) {
                list.add(i - j + 1);
                j = 0;
            }
        }
        System.out.println(list.size());
        if (!list.isEmpty()) {
            System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}