
import java.util.Scanner;

public class AreaOfCylinder{


     //V=πr*rh  ===area of cylinder

     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of cylinder");

       double radius=sc.nextDouble();
       System.out.println("Enter height of cylinder");
      double  height=sc.nextDouble();
         areaOfCylinder(radius,height);
     }

     public static void areaOfCylinder(double radius , double height){
        double res= 3.14*radius*radius*height;

        System.out.println("AreaOfCylinder: " +res);
     }

}