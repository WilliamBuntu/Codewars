import java.util.regex.Pattern;

public class CamelCase {

    public static void main(String[] args) {
        String sentence = "the-stealth-warrior",
               sentence1 = "the_stealth_warrior";

        System.out.println("Original sentence: " + sentence);
        System.out.println("CamelCase sentence: " + camelCase(sentence1));
    }

    public static String camelCase(String sentence)  {

        return Pattern.compile("[-|_](.)").matcher(sentence).replaceAll(m -> m.group(1).toUpperCase());
    }
}
