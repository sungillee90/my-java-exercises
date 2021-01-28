package practiceJava;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    static class Solution {
        // use backtracking (almost same as recursing)

        public List<String> generateParenthesis(int n) {
            List<String> ret = new ArrayList<>();
            process(n, 0, 0, "", ret); // recurse
            return ret;
        }

        public void process(int n, int numOpen, int numClosed, String str, List<String> ret) {
            if (numOpen == n && numClosed == n) {
                ret.add(str);
                return;
            }

            if (numOpen < n) {
                process(n, numOpen+1, numClosed, str+"(", ret);
            }
            if (numClosed < numOpen) {
                process(n, numOpen, numClosed+1, str+")", ret);
            }
        }

    }
}
