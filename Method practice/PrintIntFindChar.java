/*6. Design a method which will accept an int number and will print its
associated character value. */

public class PrintIntFindChar {

    public static void printIntFindChar(int a){
        char res= (char) a;
        System.out.println( "Charcter value of int : "+res);
    }
    

    public static void main(String[] args) {
        printIntFindChar(99);
    }
}
