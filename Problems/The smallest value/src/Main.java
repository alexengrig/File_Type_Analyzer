import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger value = new BigInteger(scanner.next());
        System.out.println(factorial(value));
    }

    private static long factorial(BigInteger max) {
        long target = 1;
        BigInteger value = BigInteger.ONE;
        BigInteger i = BigInteger.TWO;
        while (value.compareTo(max) < 0) {
            target++;
            value = value.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        return target;
    }
}