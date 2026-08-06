

public class DiscountedPrice {


    /*3. Write a java program to design a method which will accept the price of a
shirt and the % discount value and will print the discounted price. */
    public static void DiscountPricess(double price,double discount){
        double discountPrice= price*(100-discount)/100;
        System.out.println("=======================");
        System.out.println("Price : "+ price);
        System.out.println("Discount : "+ discount);
        System.out.println("price after discount : "+ discountPrice);


    }

    public static void main(String[] args) {
        DiscountPricess(3000, 40);

    }
}
