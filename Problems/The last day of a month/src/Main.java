import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate date = Year.of(year).atDay(day);
        System.out.println(date.lengthOfMonth() == date.getDayOfMonth());
    }
}