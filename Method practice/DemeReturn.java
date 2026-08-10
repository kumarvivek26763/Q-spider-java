public class DemeReturn {
    public static int test(int a){
        System.out.println("test");
    return start(a+10)+demo(2*a); //start 42+20
}

public static int demo(int a){
    System.out.println("Semo method start");
    return start(a/2);

}
public static int start (int a){
    System.out.println("Start method starts!");
    return a+12; //42
}

public static void main(String[] args) {
        int res=test(20);
        System.out.println("result :" + res);
}
}
