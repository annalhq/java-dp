package cls.template.beverage;

public class Coffee extends BeverageTemplate{
    @Override
    public void boilWater(){
    System.out.println("boiling water for coffee");
    }

    @Override
    public void addMilk() {
        System.out.println("adding half cup milk!");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding coffee beans");
    }

    @Override
    public void pourBeverage() {
        System.out.println("serving hot coffee");
    }

}
