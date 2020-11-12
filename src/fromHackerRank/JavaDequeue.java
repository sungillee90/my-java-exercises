package fromHackerRank;
import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int[] arrInt = new int[10000001];
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        int current_uniq = 0;


        for (int i = 0; i < n; i++) {
            if (i >= m) {
                int old = deque.removeLast();
                if (arrInt[old] >= 1) {
                    arrInt[old]--;
                    if (arrInt[old] == 0) {
                        current_uniq--;
                    }
                }
            }
            int num = in.nextInt();
            deque.addFirst(num);
            if (arrInt[num] == 0) {
                current_uniq++;
                if (current_uniq == m) {
                    System.out.println(current_uniq);
                    return;
                }
                max = Math.max(max, current_uniq);
            }
            arrInt[num]++;
        }
        System.out.println(max);
    }
}
