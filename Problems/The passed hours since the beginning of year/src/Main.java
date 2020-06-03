import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(ChronoUnit.HOURS.between(
                LocalDateTime.of(dateTime.getYear(), Month.JANUARY, 1, 0, 0),
                dateTime
        ));
    }
}