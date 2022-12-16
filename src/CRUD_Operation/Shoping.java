package CRUD_Operation;

import java.util.ArrayList;
import java.util.Scanner;

public class Shoping {


    Scanner sc = new Scanner(System.in);

    ArrayList<Product> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to shoping app");

        Shoping  shoping = new Shoping();

        while (true){
            System.out.println(" enter  1 product name for addd ");
            System.out.println("  enter 2 display all product");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    shoping.addproduct();
                    break;
                case 2:
                    shoping.displayproduct();
                    break;
                default:
                    break;
            }
        }





    }
    public  void addproduct(){
        Product product = new Product();
        System.out.println(" enter name of product");
        product.setName(sc.next());
        System.out.println(" enter price of product ");
        product.setPrice(sc.nextFloat());
        System.out.println(" enter id of product");
        product.setId(sc.next());

        System.out.println(" add successfully");

        list.add(product);
        System.out.println(product);
    }

    public void displayproduct(){

        System.out.println(list);
    }
}
