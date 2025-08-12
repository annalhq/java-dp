package cls.proxy.internet;

public class RealObject implements Object {
    @Override
    public void doSomething() {
        System.out.println("this is real");
    }
}
