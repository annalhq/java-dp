package cls;
public class Singleton {
    private static Singleton instance;
    public String value;

    // private constructor
    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public static void main(String[] args) {
//        Singleton instance1 = getInstance("one");
//        Singleton instance2 = getInstance("two");

        System.out.println(instance);


        System.out.println("------------");


//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());
    }
}
