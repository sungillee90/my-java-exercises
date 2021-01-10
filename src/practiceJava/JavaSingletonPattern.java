package practiceJava;

public class JavaSingletonPattern {
    static class Singleton{
        private Singleton() {

        }
        public String str;
        private static Singleton instance = new Singleton();
        public static Singleton getSingleInstance() {
            return instance;
        }
    }
}
