package cls.proxy.internet;

public class ObjectProxy implements Object {
    Object o1 = new RealObject();

    @Override
    public void doSomething() {
        System.out.println("proxy Object delegating");
        o1.doSomething();
    }

}
