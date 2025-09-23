package cls.template.beverage;

public class Main {
    public static void main(String[] args) {
        BeverageTemplate b1 = new Tea();
        b1.makeBeverage();
        System.out.println();

        b1 = new Coffee();
        b1.makeBeverage();
    }
}
