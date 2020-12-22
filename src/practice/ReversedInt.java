package practice;

public class ReversedInt {
    public int reverse(int x) {
        int reversed = 0;
        int pop;

        while (x != 0) {
            pop = x % 10;
            x = x/10;

            reversed = (reversed * 10) + pop;
        }

        return reversed;
    }
}

