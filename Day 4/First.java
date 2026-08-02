import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        String name, address;
        int salary, age, empid;
        System.out.println("hello");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your empId:");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your address:");
        address = sc.nextLine();
        System.out.println("Enter your Salary:");
        salary = sc.nextInt();
        System.out.println("EmpId:" + empid);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
        System.out.println("Address:" + address);

    }
}
