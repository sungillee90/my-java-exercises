package practice.BuilderPattern;

public class ComputerFactory {
    private BluePrint bluePrint;

    public ComputerFactory(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }
    public Computer make() {
        return null;
    }
}
