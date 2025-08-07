package cls.prototype;

public class Phone implements Cloneable {
    int ram;
    int screenSize;

    Phone (int r, int s){
        this.ram = r;
        this.screenSize = s;
    }

    // constructor based copying
    Phone(Phone other){
        this.ram = other.ram;
        this.screenSize = other.screenSize;

    }

    // default java method
    Phone phoneCopy() throws CloneNotSupportedException{
        return (Phone)this.clone();
    }


}
