package CLASS_OBJECT;

public class Animal {
    String aName;
    String aColor;
    double aWeight;

    public void setData(String a, String b, double c){
         aName=a;
         aColor=b;
         aWeight=c;
        

        }
        public void getData(){
        System.out.println("Animal name= " +aName);
        System.out.println("Animal Color= " +aColor);
        System.out.println("Animal Weight= " +aWeight);

    }

    
}
