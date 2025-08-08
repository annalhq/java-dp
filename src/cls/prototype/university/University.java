package cls.prototype.university;
/*
@client code
 */
public class University {
    public static void main(String[] args) {

        Person studentPrototype = new Student("alan");
        Person teacherPrototype = new Teacher("robert");

        Person clonedStudent = studentPrototype.clone();
        Person clonedTeacher = teacherPrototype.clone();

        clonedStudent.setName("vlad");
        clonedTeacher.setName("petr");

        System.out.println("Student:" + clonedStudent.getName());
        System.out.println("Teacher:" + clonedTeacher.getName());
    }
}
