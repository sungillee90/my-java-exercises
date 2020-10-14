package practice;

public class FibonacciPrac {
    public static void main(String[] args) {
        FibonacciPrac run = new FibonacciPrac();
        run.fib(5);
        System.out.println(run.fib(5));
    }
    public int fib(int N) {

        if (N == 0){
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N-1) + fib(N-2);
    }
}
