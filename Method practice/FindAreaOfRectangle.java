public class FindAreaOfRectangle{




    //P=2(l+w)  rectangle of parimeter
    //a=l*w     area of rectangle


    public static void main(String[] args) {
           areaOfRectangle(10, 20);
           parimeterOfRectangle(20, 30);
    }

    public static void areaOfRectangle(double length , double width){

            double res=length*width;
            System.out.println("Area of rectangle : " + res);
        

    }

    public static void parimeterOfRectangle(double length, double width){
             double res=2*(length+width);
             System.out.println("Parimeter of rectangle :" + res);
    }

    



}