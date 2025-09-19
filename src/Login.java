import javax.swing.*;

public class Login {
    static String adminName="admin";
    static String adminPassword="1";
    public static String loggedInCustomerName ="";

    public static void beginLogin(){
        String[] startOptions={"Admin","Customer","Exit"}; // array
        int startChoice= JOptionPane.showOptionDialog(
                null,
                "Welcome to Shop\nSelect an option",
                "Shop Login",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                startOptions,startOptions[0]
        );
        if(startChoice==2 || startChoice==JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(null,"Thank you for visiting");
        }
        if(startChoice==0){
            boolean loginInAdmin=false;
            while(!loginInAdmin){
                String adminUserNameInput= JOptionPane.showInputDialog("Admin user name : ");
                if(adminName==null) break;
                String adminPasswordInput=JOptionPane.showInputDialog("Admin password : ");
                if(adminPassword==null) break;

                if(adminUserNameInput.equals(adminName) && adminPasswordInput.equals(adminPassword)){
                    JOptionPane.showMessageDialog(null,"Welcome Admin","Login Success",JOptionPane.INFORMATION_MESSAGE);
                    loginInAdmin=true;
                    AdminMenu.options();
                }else{
                    String [] incorrectOptions={"Try Again","Back To Start"};
                    int incorrectChoice=JOptionPane.showOptionDialog(
                            null,
                            "Incorrect username or password.\n Please Try Again",
                            "Admin Login",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            incorrectOptions,
                            incorrectOptions[0]
                    );
                    if(incorrectChoice==1 || incorrectChoice==JOptionPane.CLOSED_OPTION) break;
                }
            }
        }

    }
}
