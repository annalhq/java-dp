package cls.proxy.server;

public class RealInternet implements Internet{
    @Override
    public void GET(String hostServer) {
        System.out.println("connecting to your" + hostServer);
    }
}
