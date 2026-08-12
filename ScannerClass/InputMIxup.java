import java.util.Scanner;
public class InputMIxup{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
          
          System.out.println("Enter your age :");
               int age=sc.nextInt();          
          System.out.println("Enter your Name :");
          String name=sc.nextLine();
           System.out.println("Enter your weight");
           double weight= sc.nextDouble();
 System.out.println("Enter your Address: ");
           String Address= sc.nextLine();
 System.out.println("Enter your Gender : ");
           char gender= sc.next().charAt(0);
 System.out.println("Enter your City: ");
           String city= sc.nextLine();
 System.out.println("Are u Graduate?:  ");
           boolean graduate= sc.nextBoolean();



           


         
          System.out.println("=====Your Entered=====");
          System.out.println("Name is :" + name);
          System.out.println("Age is :" + age);
 System.out.println("Address is :" + Address);
System.out.println("weight is :" + weight);
System.out.println("Gender is : "+ gender);
System.out.println("City is : " + city);
 System.out.println("Graduate :" + graduate);




        }

}

