public class Calculator {
    public void add(double a,double b){
        double res=a+b;
        System.out.println("Addition of A and B : " + res);
    }
    public  void subtract(double  a, double b){
        double res=a-b;
        System.out.println("Difference between A and B : " +res);
    }
    public  void multiply(double  a, double b){
        double res=a*b;
        System.out.println("Multiply  A and B : " +res);
    }public  void divide(double  a, double b){
        double res=a/b;
        System.out.println("Divide A and B : " +res);
    }

    public static void main(String[] args) {
                  Calculator cal=new Calculator();
                  cal.add(10, 20); 
                  cal.subtract(280, 10);
                  cal.divide(10, 5);
                  cal.multiply(54, 6);
    }
}
