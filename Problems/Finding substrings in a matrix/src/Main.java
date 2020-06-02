public class Main {
    public static void main(String[] args) {

    }

    public static int[][] prefixFunction(char[][] chars) {
        int[][] target = new int[chars.length][];
        int k = 0;
        for (int i = 0, rows = chars.length; i < rows; i++) {
            target[i] = new int[chars[i].length];
            for (int j = i == 0 ? 1 : 0, cols = chars[i].length; j < cols; j++) {
                while (k > 0 && chars[i][j] != chars[k / rows][k % cols]) {
                    k = target[(k - 1) / rows][(k - 1) % cols];
                }
                if (chars[i][j] == chars[k / rows][k % cols]) {
                    target[i][j] = ++k;
                }
            }
        }
        return target;
    }
}