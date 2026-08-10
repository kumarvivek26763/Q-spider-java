

public class Q1 {
    public static void main(String[] args) {

        double avg=getAverage(30, 89, 23);
        System.out.printf("%s%.2f \n", "avg :" ,avg);

        
        
    }

    public static double getAverage(double a, double b, double c){
        return (a+b+c)/3;
    }
}
