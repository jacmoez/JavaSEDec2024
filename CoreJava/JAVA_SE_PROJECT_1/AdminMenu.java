import java.util.Scanner;

public class AdminMenu {
    public static void displayMenu(){
        System.out.println("----------------------------------------");
        System.out.println("Admin Menu");
        System.out.println("----------------------------------------");
        System.out.println("(1) Manage Products                     ");
        System.out.println("(2) View Customer Account ");
        System.out.println("(3) View Transactions ");
        System.out.println("(0) Logout");
    }

    public static  void options(){
        Scanner sc=new Scanner(System.in);// input , file
        boolean aMenuRunning=true;
        while(aMenuRunning){
            displayMenu();
            System.out.println("To get started, select a number : ");
            int number=sc.nextInt();
            switch (number){
                case 1:
                    System.out.println("Manage Products ");
                    ManageProduct.displayMenu();
                    break;
                case 2:
                    System.out.println("[----------- View Customer Account --------] ");
                    Customer.viewCustomers();
                    break;
                case 3:
                    //System.out.println("View Transactions ");
                    Transaction.viewAllTransactions();
                    break;
                case 0:
                    System.out.println("Logging out ........");
                    aMenuRunning=false;
                    Login.beginLogin();
                    break;
                default:
                    System.out.println("Invalid Options. Try Again");

            }
        }

    }
}