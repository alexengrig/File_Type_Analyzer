import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.length() < 12) {
            System.out.println("NO");
            return;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        for (int i = 0, l = password.length(); i < l; i++) {
            char ch = password.charAt(i);
            if (!hasUppercase && Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (!hasLowercase && Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (!hasDigit && Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        if (hasUppercase && hasLowercase && hasDigit) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}