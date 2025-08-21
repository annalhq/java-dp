package cls.composite.company;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee {
    private String name;
    //a
    private String position;
    private int empID;
    private final List<Employee> employeeList = new ArrayList<>();

    public Composite(String name, String position, int empID) {
        this.name = name;
        this.position = position;
        this.empID = empID;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println(name + "\t" + position + "\t" + empID);
        for (Employee employee : employeeList) {
            employee.getEmployeeDetails();
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
