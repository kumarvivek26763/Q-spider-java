

public class Average {
    /*2. Write a java program to design a method which will accept three
numbers and will print the average of three numbers*/


     public void FindAverage(double  a , double b, double  c){
        double res=(a+b+c)/3;
        System.out.println("Average between three number : "  + res);
     }

     public static void main(String[] args) {
         Average avg =new Average();
         avg.FindAverage(12, 34, 45);

     }
}
