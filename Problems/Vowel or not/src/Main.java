import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Set<Character> VOWELS = Set.of('A', 'E', 'I', 'O', 'U');

    public static boolean isVowel(char ch) {
        return VOWELS.contains(Character.toUpperCase(ch));
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}