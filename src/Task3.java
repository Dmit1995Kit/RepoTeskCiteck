import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        final String input = "570900";
        final String transform = "1";

        StringBuilder builder = new StringBuilder(input);
        builder.replace(builder.length()-1, builder.length(), transform);
        System.out.println(builder.toString());

    }
}
