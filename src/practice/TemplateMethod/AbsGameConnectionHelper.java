package practice.TemplateMethod;


public abstract class AbsGameConnectionHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String username);
    protected abstract String connection(String info);

    // Template Method
    public String requestConnection(String encodedInfo) {
        String decodedInfo = doSecurity(encodedInfo);

        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)){
            throw new Error ("Please check your ID or password");
        }

        String userName = "userName";

        int i = authorization(userName);

        switch (i) {
            case 0:
                System.out.println("Game Manager");
                break;
            case 1:
                System.out.println("Paid Member");
                break;
            case 2:
                System.out.println("FreeExperience User");
                break;
            case 3:
                System.out.println("You do NOT have excess");
                break;
            default:
                System.out.println("ETC");
                break;
        }

        return connection(decodedInfo);
    }
}

