package cls.prototype.university;
/*
@client code
 */
public class University {
    public static void main(String[] args) {

        Person studentPrototype = new Student("alan");
        Person teacherPrototype = new Teacher("robert");

        Person clonedStudent = studentPrototype.clonePerson();
        Person clonedTeacher = teacherPrototype.clonePerson();

        clonedStudent.setName("vlad");
        clonedTeacher.setName("petr");

        System.out.println("Student:" + clonedStudent.getName());
        System.out.println("Teacher:" + clonedTeacher.getName());

        System.out.println("-------------------------");
        System.out.println("Student Prototype: " + studentPrototype.getName() +
                " and HashCode: " + studentPrototype.hashCode());
        System.out.println("Cloned Student: " + clonedStudent.getName() +
                " and HashCode: " + clonedStudent.hashCode());

        System.out.println("-------------------------");

        System.out.println("Teacher Prototype: " + teacherPrototype.getName() +
                " and HashCode: " + teacherPrototype.hashCode());
        System.out.println("Cloned Teacher: " + clonedTeacher.getName() +
                " and HashCode: " + clonedTeacher.hashCode());
    }
}
