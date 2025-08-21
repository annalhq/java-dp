package cls.composite.company;

public class Leaf implements Employee {
    private String name;
    private String position;
    private int empID;

    public Leaf(String name, String position, int empID) {
        this.name = name;
        this.position = position;
        this.empID = empID;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println(name + "\t" + position + "\t" + empID);
    }

    @Override
    public void addEmployee(Employee employee) {}

    @Override
    public void removeEmployee(Employee employee) {}
}
