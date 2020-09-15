package practice.TemplateMethod.Library;

public class DefaultGameConnectHelper extends AbsGameConnectionHelper{
    @Override
    protected String doSecurity(String string) {
        System.out.println("Decoded");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("ID/ Password checker");
        return true;
    }

    @Override
    protected int authorization(String username) {
        System.out.println("Check Autho. Game manager logged in (in this case)");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("Last Connection!");
        return info;
    }
}
