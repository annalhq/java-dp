package cls.decorator.pizza;

public class VegPizza extends Pizza{

    double value;

    public VegPizza(){
        description = "VegPizza";
        value = 200.0d;
    }

    public double cost(){
        return value;
    }
}
