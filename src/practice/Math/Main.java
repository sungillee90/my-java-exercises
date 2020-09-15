package practice.Math;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapImple();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(80f));
    }
}
