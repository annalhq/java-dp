package cls.prototype.university;

public class Teacher implements Person{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public Teacher clonePerson(){
        return new Teacher(this.name);
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
