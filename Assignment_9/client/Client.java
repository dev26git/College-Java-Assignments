package PIJL_Assignments.Assignment_9.client;

import PIJL_Assignments.Assignment_9.model.Product;
import PIJL_Assignments.Assignment_9.repos.ProductRepo;
import PIJL_Assignments.Assignment_9.service.ProductService;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        int id;

        // object to access methods of ProductRepo
        ProductRepo productRepo = new ProductRepo();
        Scanner sc = new Scanner(System.in);

//        // Purchase product
//        for(Product p: productRepo.getALlProducts()) {
//            System.out.println(p);
//        }
//        System.out.print("\nEnter id of the product you want to buy: ");
//        id = sc.nextInt();
//        System.out.print("\nEnter quantity: ");
//        int quantity = sc.nextInt();
//        double bill_amt = ProductService.getBillAmount(id, quantity);
//        System.out.println("Bill amount: " + bill_amt);
//        System.out.println("Have you paid the bill (yes/no)? :");
//        sc.nextLine();
//        String bill_payment = sc.nextLine();
//        if(bill_payment.equalsIgnoreCase("yes")) {
//            if(ProductService.purchase(id, quantity)) {
//                System.out.println("Purchase Complete.");
//            }
//            else {
//                System.out.println("Purchase could not be processed.");
//            }
//        }

        // SEARCH BY ID

        System.out.println("Enter product id to search: ");
        id = sc.nextInt();

        Product product = productRepo.getProductById(id);

        if(product == null) {
            System.out.println("No such product found.");
        }
        else {
            System.out.println(product);
        }


        // ADD PRODUCT
        product = new Product();
        System.out.println("Enter product id, title, price, quantity to save: ");
        product.setId(sc.nextInt());
        sc.nextLine();
        product.setTitle(sc.nextLine());
        product.setPrice(sc.nextDouble());
        product.setQuantity(sc.nextInt());

        System.out.println(product);
    }
}
