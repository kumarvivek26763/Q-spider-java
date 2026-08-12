import java.util.Scanner;
public class InputUsingParseType{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
          
           System.out.println("Enter your age :");
           int age = Integer.parseInt(sc.nextLine());         
           System.out.println("Enter your Name :");
           String name=sc.nextLine();
           System.out.println("Enter your weight");
           double weight=Double.parseDouble(sc.nextLine());
           System.out.println("Enter your Address: ");
           String Address= sc.nextLine();
           System.out.println("Enter your Gender : ");
           char gender= sc.nextLine().charAt(0);
           System.out.println("Enter your City: ");
           String city= sc.nextLine();
           System.out.println("Are u Graduate?:  ");
           boolean graduate=Boolean.parseBoolean(sc.nextLine());



           


         
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

