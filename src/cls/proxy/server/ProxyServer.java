package cls.proxy.server;
import java.util.ArrayList;
import java.util.List;

public class ProxyServer implements Internet {
    private final RealInternet rl = new RealInternet();
    private static final List<String> blackList;

    static {
        blackList = new ArrayList<>();
        blackList.add("google.com");
        blackList.add("youtube.com");
    }
    @Override
    public void GET(String hostServer) {
        if (blackList.contains(hostServer.toLowerCase())){
            System.out.println("site is blacklisted! cant be accessed");
        }
        rl.GET(hostServer);
    }
}
