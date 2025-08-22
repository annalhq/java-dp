package cls.decorator.pizza;

public class CapsicumDecorator extends Decorator{
    Pizza pizza;

    public CapsicumDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription()+ " " + "decorated by capsicum topping" + " ";
    }
    public double cost(){
        return pizza.cost() + 2.0;
    }
}
