package ie.atu.javaTest;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Product p =new Product();
        //product 1
        p.setProductId("DR12");
        p.setName("drill");
        p.setPrice(90);
        p.setQuantity(2);
        //product 2
        p.setProductId("HM52");
        p.setName("Hammer");
        p.setPrice(30);
        p.setQuantity(1);
        //product 3
        p.setProductId("SC134");
        p.setName("Screwdriver");
        p.setPrice(25);
        p.setQuantity(5);

        Scanner sc=new Scanner(System.in);



        int choice= sc.nextInt();
        ArrayList<String>product=new ArrayList<>();
        product.add("Drill");
        product.add("Hammer");
        product.add("Screw Driver");


        System.out.println("Please choose one of the following options");
        System.out.println("1: Add Product \n 2: Update Product: \n 3:Display All Products: \n 4: Exit: \n");

        String newProduct;
        switch (choice)
        {
            case 1:
                System.out.println("Add a new Product");
                if(newProduct!= p.getProductId())
                {
                    int newP= sc.nextInt();
                product.add(""+newP);
                break;
                }
                else{
                    System.out.println("Product already exists");
                }

            case 2:
                System.out.println("Update a Current Product");
                break;
            case 3:
                System.out.println("Display all Product");

                for(String s:product)
                {
                    System.out.println("Products are : " + s);

                }
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
