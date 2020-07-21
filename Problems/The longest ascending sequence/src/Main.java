import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(lis(array));
    }

    public static int lis(int[] array) {
        int length = array.length;
        if (length == 0) {
            return 0;
        }
        int max = 0;
        int[] lis = new int[length];
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i && array[j] < array[i]; j++) {
                if (lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    if (max < lis[i]) {
                        max = lis[i];
                    }
                }
            }
        }
        return max + 1;
    }
}