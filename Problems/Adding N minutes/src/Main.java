import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine()).plusMinutes(scanner.nextLong());
        System.out.println(Stream.of(dateTime.getYear(), dateTime.getDayOfYear(), dateTime.toLocalTime())
                .map(Objects::toString)
                .collect(Collectors.joining(" ")));
    }
}