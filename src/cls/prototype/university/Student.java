package cls.prototype.university;

public class Student implements Person{
    private  String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public Student clonePerson(){
        return new Student(this.name);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
}
