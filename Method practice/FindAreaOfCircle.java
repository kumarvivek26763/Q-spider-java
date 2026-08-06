public class FindAreaOfCircle {
//    A=πr2  area of circle
//    a=2πr   parimeter of circle

  public static void main(String[] args) {
      areaOfCircle(3);
      parimeterOfCircle(8);
  }
      public static void areaOfCircle(double radius)
      {
          double res=3.14*radius*radius;
          System.out.println("Area of radius : " + res);
      }

      
      public static void parimeterOfCircle(double radius)
      {
          double res=2*(3.14*radius);
          System.out.println("Parimeter of radius : " + res);
      }


    
}
