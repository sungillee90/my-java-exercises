package practice.BuilderPattern;

public class Main {
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBlueprint());
//        factory.setBlueprint(new MacBookAirBlueprint());
//        Computer computer = factory.makeAndGet();
        Computer computer = new factory.make();
        Computer computer = new factory.getComputer();

        Computer macBook = new Computer("8 core i9", "32GB", "1TB SSD");

        System.out.println(macBook.getCpu());
        System.out.println(macBook.toString());
    }
}
