import java.util.*;
import java.util.stream.Collectors;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(
            Map<String, List<String>> first,
            Map<String, List<String>> second) {

        // Create a list of free men (first map keys)
        List<String> freeMen = new ArrayList<>(first.keySet());

        // Create a map to store the current engagements
        Map<String, String> engagements = new HashMap<>();

        // Create a map to store the preferences of the second group (women)
        Map<String, List<String>> womenPreferences = second;

        // Create a map to store the inverse of women's preferences for ranking
        Map<String, Map<String, Integer>> womenRanking = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : womenPreferences.entrySet()) {
            String woman = entry.getKey();
            List<String> preferences = entry.getValue();
            Map<String, Integer> ranking = new HashMap<>();
            for (int i = 0; i < preferences.size(); i++) {
                ranking.put(preferences.get(i), i);
            }
            womenRanking.put(woman, ranking);
        }

        // While there are free men and not all are engaged
        while (!freeMen.isEmpty()) {
            String man = freeMen.remove(0);
            List<String> manPreferences = first.get(man);

            for (String woman : manPreferences) {
                if (!engagements.containsKey(woman)) {
                    // Woman is free, engage them
                    engagements.put(woman, man);
                    break;
                } else {
                    // Woman is engaged, check if she prefers the new man
                    String currentMan = engagements.get(woman);
                    Map<String, Integer> ranking = womenRanking.get(woman);

                    if (ranking.get(man) < ranking.get(currentMan)) {
                        // Woman prefers the new man, break the current engagement
                        engagements.put(woman, man);
                        freeMen.add(currentMan);
                        break;
                    }
                }
            }
        }

        // Invert the map to return the result in the expected format
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : engagements.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }

        return result;
    }
}
