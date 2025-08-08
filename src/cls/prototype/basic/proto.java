package cls.prototype.basic;


public class proto {
    public static void main(String[] args) throws CloneNotSupportedException {
        Phone obj1 = new Phone(8,16);

        Phone obj2 = obj1.phoneCopy();

        Phone obj3 = new Phone(obj1);

        System.out.println(obj1.ram);
        System.out.println(obj2.ram);
        System.out.println(obj3.ram);

        System.out.println("----------");

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }

}