package oop1;

public class Main {
    public static void main(String[] args) {
                    //set values
        Product product1 = new Product();
        product1.name="kahve makinası";
        product1.discount=2;
        product1.imageUrl="https://cdn.karaca.com/image/banner/153.01.06.4923-300.jpg";
        product1.unitInStock=200;
        product1.unitPrice=100;

        //get values

        System.out.println(product1.name);
        System.out.println(product1.discount);
        System.out.println(product1.imageUrl);
        System.out.println(product1.unitInStock);
        System.out.println(product1.unitPrice);



    }
}