package rev.basics;

class Student {
    int rno;
    String name;


    // ALT+G for generators in intellij
    Student(){
        this.rno = 1;
        this.name = "defaultName";
    }

    Student(int n, String s){
        this.rno = n;
        this.name = s;
    }

    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student std = new Student(12, "alan");
        System.out.println(std.rno);
        System.out.println(std.name);

        System.out.println("----------------");

        // constructor overloading
        Student std1 = new Student();
        System.out.println(std1.rno);
        System.out.println(std1.name);

        System.out.println("----------------");
        Student copied_std  = new Student(std);
        System.out.println(copied_std.rno);
        System.out.println(copied_std.name);
    }

}
