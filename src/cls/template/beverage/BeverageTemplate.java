package cls.template.beverage;

public abstract class BeverageTemplate {
    public final void makeBeverage(){ // final template method
        boilWater();
        addMilk();
        addCondiments();
        pourBeverage();
    }
    public abstract void boilWater();
    public abstract void addMilk();
    public abstract void addCondiments();
    public abstract void pourBeverage();
}
