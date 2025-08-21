package cls.composite.company;

public class Company {
     public static void main(String[] args) {
          Employee sde1 = new Leaf("SDE 1", "Engineer", 101);
          Employee sde2 = new Leaf("SDE 2", "Engineer", 102);
          Employee ui1 = new Leaf("UI 1", "Engineer", 103);
          Employee ui2 = new Leaf("UI 2", "Engineer", 104);

          Composite hrManager1 = new Composite("HR Manager 1", "Manager", 201);
          hrManager1.addEmployee(sde1);
          hrManager1.addEmployee(sde2);

          Composite hrManager2 = new Composite("HR Manager 2", "Manager", 202);
          hrManager2.addEmployee(ui1);
          hrManager2.addEmployee(ui2);

          Composite ceoTeam = new Composite("CEO", "CEO", 1);
          ceoTeam.addEmployee(hrManager1);
          ceoTeam.addEmployee(hrManager2);

          System.out.println("Company Hierarchy:");
          ceoTeam.getEmployeeDetails();
     }
}
