import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Wedding {
    // Write a function createCouple that returns a map of names which associates randomly 
    // a name from the first list to a name of the second list.
    // If the lists have different sizes, some names from the bigger list will be ignored.
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        List<String> firstList = first.stream().toList();
        List<String> secondList = second.stream().toList();  
        
        Collections.shuffle(firstList);
        Collections.shuffle(secondList);

        Map<String, String> couples = new HashMap<>();
        int size = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < size; i++) {
            couples.put(firstList.get(i), secondList.get(i));  
        }
        return couples;
    }
}