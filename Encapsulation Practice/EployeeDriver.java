public class EployeeDriver {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setEmpId(334);
        emp1.setEmpName("Mr. Prince ");
        emp1.setSalary(23004.4);

        System.out.println("Employee Id: "+ emp1.getEmpId());
         System.out.println("Employee Name: "+ emp1.getEmpName());
          System.out.println("Employee Salary: "+ emp1.getSalary());

    }
}
