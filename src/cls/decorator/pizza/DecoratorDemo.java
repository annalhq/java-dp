package cls.decorator.pizza;

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza curr2 = new TomatoDecorator(new CapsicumDecorator(new VegPizza()));

        System.out.println(curr2.getDescription() + " $" + curr2.cost());
    }
}
