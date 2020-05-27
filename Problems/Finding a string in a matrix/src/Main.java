import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();
        String[] sizes = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(sizes[0]);
        int cols = Integer.parseInt(sizes[1]);
        char[][] chars = new char[rows][];
        for (int i = 0; i < rows; i++) {
            String string = scanner.nextLine();
            char[] values = string.toCharArray();
            if (values.length != cols) {
                throw new IllegalArgumentException(
                        "Expected cols: " + cols + "; actual: " + values.length + ", line: " + string);
            }
            chars[i] = values;
        }
        int[] prefixFunction = prefixFunction(pattern);
        List<String> target = new ArrayList<>();
        int l = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                char ch = chars[i][j];
                while (l > 0 && ch != pattern.charAt(l)) {
                    l = prefixFunction[l - 1];
                }
                if (ch == pattern.charAt(l)) {
                    l++;
                }
                if (l == pattern.length()) {
                    int index = i * cols + j - l + 1;
                    int row = index / cols;
                    int col = index % cols;
                    target.add(row + " " + col);
                    l = prefixFunction[l - 1];
                }
            }
        }
        System.out.println(target.size());
        if (!target.isEmpty()) {
            System.out.println(String.join("\n", target));
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
}
