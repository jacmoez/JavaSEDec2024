import java.util.Scanner;

public class CustomerMenu {
    /*
      View Products
      Purchase Product
      View My Transition
      Logout
     */
    public  static void displayMenu(){
        System.out.println("===================================");
        System.out.println("               Customer Menu   ");
        System.out.println("===================================");
        System.out.println("(1) View Products\n(2) Purchase Product\n(3) View My Transitions \n(0) Logout");

    }
    public static void options(){
        Scanner sc=new Scanner(System.in);
        boolean cMenuRunning=true;
        while (cMenuRunning){
            displayMenu();
            System.out.println("Select a number");
            int number=Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (number){
                case 1:
                    System.out.println("[----------- Shop Inventory ----------]");
                    //System.out.println("View Products");
                    ProductServices.viewProducts();
                    break;
                case 2:
                    System.out.println("[---------- Purchase Product ---------]");
                    ProductServices.purchaseProduct();
                    break;
                case 3:
                    System.out.println("[---------- View My Transitions ---------]");
                    Transaction.viewCustomerTransactions(Login.loggedInCustomerName);
                    break;
                case 0:
                    System.out.println("Logging out .......");
                    cMenuRunning=false;
                    Login.beginLogin();
                    break;
                default:
                    System.out.println("Invalid Option . Try again");
            }
        }
    }
}
