import java.util.Scanner;

public class ManageProduct {
    // products
    public static void displayMenu(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println("|          Product Manager         |");
            System.out.println("-----------------------------------");
            System.out.println("(1) Add Product \n(2) Delete Product\n(3) View Products\n(0) Back");
            System.out.println("Select a number :  ");
            int number=sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (number){
                case 1:
                    System.out.println("[--------------- Add Product ---------------]");
                    ProductServices.addProduct();
                    break;
                case 2:
                    System.out.println("Delete Product");break;
                case 3:
                    System.out.println("[ --------------- View Product ------------]");
                    ProductServices.viewProducts();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option . Try Again");
            }


        }
    }
}
