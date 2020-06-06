import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        Map<Character, Integer> firstMap = multiset(first);
        Map<Character, Integer> secondMap = multiset(second);
        int count = 0;
        for (Character ch : firstMap.keySet()) {
            if (secondMap.containsKey(ch)) {
                count += Math.min(firstMap.get(ch), secondMap.get(ch)) * 2;
            }
        }
        System.out.println(first.length() + second.length() - count);
    }

    private static Map<Character, Integer> multiset(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : string.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}