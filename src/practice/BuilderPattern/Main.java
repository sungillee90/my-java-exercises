package practice.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Computer macBook = new Computer("8 core i9", "32GB", "1TB SSD");

        System.out.println(macBook.getCpu());
        System.out.println(macBook.toString());
    }
}
