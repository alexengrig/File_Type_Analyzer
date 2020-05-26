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
        List<Integer> list = new ArrayList<>();
        int[] lengths = prefixFunction(pattern);
        int i = 0;
        int p = pattern.length();
        int l = text.length() - p + 1;
        while (i < l) {
            String part = text.substring(i, i + p);
            int length = matchLength(pattern, part);
            if (length == p) {
                list.add(i);
                i += length;
            } else if (length > 0) {
                i += length - lengths[length - 1];
            } else {
                i++;
            }
        }
        System.out.println(list.size());
        if (!list.isEmpty()) {
            System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }

    private static int[] prefixFunction(String str) {
        int[] array = new int[str.length()];
        char ch;
        int length;
        for (int i = 1, l = array.length; i < l; i++) {
            ch = str.charAt(i);
            length = array[i - 1];
            while (length > 0 && ch != str.charAt(length)) {
                length = array[length - 1];
            }
            if (ch == str.charAt(length)) {
                array[i] = length + 1;
            }
        }
        return array;
    }

    private static int matchLength(String pattern, String text) {
        for (int i = 0, l = pattern.length(); i < l; i++) {
            if (pattern.charAt(i) != text.charAt(i)) {
                return i;
            }
        }
        return pattern.length();
    }
}