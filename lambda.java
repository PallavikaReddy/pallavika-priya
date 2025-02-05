import java.util.*;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class lambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "banana", "grape", "kiwi");

        words.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted: " + words);

        StringProcessor processor = String::toUpperCase;
        words.forEach(word -> System.out.println( processor.process(word)));
    }
}
