import java.util.Map;

public class Tool {
    public static void main(String[] args) {
        Map<String, String> map = System.getenv();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }


        String alias = System.getenv("KEYALIAS");
        String password = System.getenv("KEYPASSWORD");
        String storeFile = System.getenv("STOREFILE");
        String storeFilePassword = System.getenv("STOREPASSWORD");
        System.out.println("alias---" + alias);
        System.out.println("password---" + password);
        System.out.println("storeFile---" + storeFile);
        System.out.println("storeFilePassword---" + storeFilePassword);
    }
}
