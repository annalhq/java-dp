package cls.prototype.university;

public class Teacher implements Person{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }
    
    public Teacher clone(){
        return new Teacher(this.name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
