public class AreaOfSquare{
    //Area (\(A\)): \(s \times s = s^2\) (measured in square units)Perimeter (\(P\)): \(s + s + s + s = 4s\) (measured in linear units)


    //Parimeter of square    4*s
    // Area of square       s*s

    

    public static void main(String[] args) {

        areaOfSquare(4);
        parimeterOfSquare(8);
        
    }
    public static void areaOfSquare(double side){
        double res=side*side;
        System.out.println("Area of Square: " + res);
    }
     public static void parimeterOfSquare(double side){
        double res=4*side;
        System.out.println("Parimeter of Square: " + res);
    }


}

