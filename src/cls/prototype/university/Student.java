package cls.prototype.university;

public class Student implements Person{
    private  String name;

    public Student(String name){
        this.name = name;
    }

    public Student clone(){
        return new Student(this.name);
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
