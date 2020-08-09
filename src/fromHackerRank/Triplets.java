package fromHackerRank;

import java.util.ArrayList;
import java.util.List;

public class Triplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int totalA = 0, totalB = 0;

        for (int i = 0; i < a.size(); i++) {
            int scoreA = a.get(i);
            int scoreB = b.get(i);
            if (scoreA != scoreB) {
                int temp = scoreA > scoreB ? totalA++ : totalB++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(totalA);
        result.add(totalB);

        return result;
    }
}
