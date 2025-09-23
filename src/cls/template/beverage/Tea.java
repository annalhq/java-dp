package cls.template.beverage;

public class Tea extends BeverageTemplate{
    @Override
    public void boilWater(){
        System.out.println("boiling water for tea");
    }

    @Override
    public void addMilk() {
        System.out.println("adding a cup of milk");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding tea masala");
    }

    @Override
    public void pourBeverage() {
        System.out.println("serving hot tea");
    }

}
