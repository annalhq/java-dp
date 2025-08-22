package cls.decorator.pizza;

public class TomatoDecorator extends Decorator{
    Pizza pizza;

    public TomatoDecorator(Pizza p){
        this.pizza = p;
    }

    public String getDescription(){
        return pizza.getDescription()+ "decorated by tomato topping";
    }
    public double cost(){
        return pizza.cost() + 4.0;
    }
}
