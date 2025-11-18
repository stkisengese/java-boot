import java.util.*;
// import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> sortedCoins = new ArrayList<>(coins);
        Collections.sort(sortedCoins, Collections.reverseOrder());

        List<Integer> result = new ArrayList<>();
        int remainingAmount = amount;

        for (int coin : sortedCoins) {
            while (remainingAmount >= coin) {
                result.add(coin);
                remainingAmount -= coin;
            }
        }
        return result;
    }
}