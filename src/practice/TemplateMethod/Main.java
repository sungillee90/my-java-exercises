package practice.TemplateMethod;

import practice.TemplateMethod.Library.AbsGameConnectionHelper;
import practice.TemplateMethod.Library.DefaultGameConnectHelper;

public class Main {
    public static void main(String[] args) {
        AbsGameConnectionHelper helper = new DefaultGameConnectHelper();

        helper.requestConnection("Id Password Logging info");
    }
}
