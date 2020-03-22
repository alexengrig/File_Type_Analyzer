package analyzer;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        final String filename = args[0];
        final String pattern = args[1];
        final String result = args[2];
        final String text = getText(filename);
        final Matcher matcher = Pattern.compile(pattern).matcher(text);
        if (matcher.find()) {
            System.out.println(result);
        } else {
            System.out.println("Unknown file type");
        }
    }

    private static String getText(String filename) throws IOException {
        try (Reader reader = new FileReader(filename)) {
            final StringBuilder builder = new StringBuilder();
            final char[] buffer = new char[1024];
            int count;
            while ((count = reader.read(buffer)) != -1) {
                builder.append(new String(buffer, 0, count));
            }
            return builder.toString();
        }
    }
}
