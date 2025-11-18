import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> resultSet = new HashSet<>(set1);

        if (set1 == null && set2 == null) return resultSet;
        if (set1 != null) resultSet.addAll(set1);
        if (set2 != null) resultSet.addAll(set2);
        return resultSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> resultSet = new HashSet<>();

        if (set1 == null || set2 == null) return resultSet;

        for (Integer element : set1) {
            if (set2.contains(element)) {
                resultSet.add(element);
            }
        }
        return resultSet;
    }
}