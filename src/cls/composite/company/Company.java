package cls.composite.company;

public class Company {
     public static void main(String[] args) {
          Employee sde1 = new Leaf("SDE 1", "Engineer", 101);
          Employee sde2 = new Leaf("SDE 2", "Engineer", 102);
          Employee clerk1 = new Leaf("Clerk 1", "Clerk", 103);
          Employee ui1 = new Leaf("UI 1", "Engineer", 103);
          Employee ui2 = new Leaf("UI 2", "Engineer", 104);
          Employee clerk2 = new Leaf("Clerk 2", "Clerk", 105);
          Employee ceo = new Leaf("CEO", "CEO", 1);


          Composite hrManager1 = new Composite("HR Manager 1", "Manager", 201);
          hrManager1.addEmployee(sde1);
          hrManager1.addEmployee(sde2);
          hrManager1.addEmployee(clerk1);

          Composite hrManager2 = new Composite("HR Manager 2", "Manager", 202);
          hrManager2.addEmployee(ui1);
          hrManager2.addEmployee(ui2);
          hrManager2.addEmployee(clerk2);

          Composite ceoTeam = new Composite("CEO", "CEO", 1);
          ceoTeam.addEmployee(hrManager1);
          ceoTeam.addEmployee(hrManager2);

          System.out.println("Company Hierarchy:");
          ceoTeam.getEmployeeDetails();

          System.out.println("---------");
          ceo.getEmployeeDetails();

          System.out.println("---------");
          sde2.getEmployeeDetails();
     }
}
