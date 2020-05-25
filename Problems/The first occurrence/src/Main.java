import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patter = scanner.nextLine();
        String text = scanner.nextLine();
        Matcher matcher = Pattern.compile(patter).matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.start());
        } else {
            System.out.println(-1);
        }
    }
}