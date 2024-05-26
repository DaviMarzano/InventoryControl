package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data : ");
        System.out.println("Name : ");
        String name = sc.nextLine();
        System.out.println("Price : ");
        double price = sc.nextDouble();

        Product product1 = new Product(name, price);

        product1.setName("Computer");
        System.out.println("Updated name : " + product1.getName());
        product1.setPrice(1200.00);
        System.out.println("Updated price : " + product1.getPrice());

        System.out.println("Product data : " + product1.toString());
        System.out.println();
        System.out.println("Enter the number of products to be added in stock : ");
        product1.AddProducts(sc.nextInt());
        System.out.println();
        System.out.println("Update data : " + product1.toString());
        System.out.println();
        System.out.println("Enter the number of products removed from stock : ");
        product1.RemoveProducts(sc.nextInt());

        System.out.println("Update data : " + product1.toString());

        sc.close();
    }
}
