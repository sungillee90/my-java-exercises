package practice.TemplateMethod;

public class DefaultGameConnectHelper extends AbsGameConnectionHelper{
    @Override
    protected String doSecurity(String string) {
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        return false;
    }

    @Override
    protected int authorization(String username) {
        return 0;
    }

    @Override
    protected String connection(String info) {
        return null;
    }
}
