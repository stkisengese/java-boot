import java.util.*;
import java.util.stream.*;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        return s.collect(
            Collectors.groupingBy(
                str -> Character.toUpperCase(str.charAt(0))
            )
        );
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        return s.collect(
            Collectors.groupingBy(
                num -> num % 4,
                Collectors.maxBy(Comparator.naturalOrder())
            )
        );
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        String joined =s.sorted()
                        .collect(
                            Collectors.joining("#"));
        return "{" + joined + "}";
    }
}