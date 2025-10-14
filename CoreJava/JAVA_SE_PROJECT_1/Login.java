

import javax.swing.*;
import java.util.Arrays;

public class Login {
    static String adminName="admin";
    static String adminPassword="1";
    public static String loggedInCustomerName ="";

    public static void beginLogin(){
        boolean exitProgram=false;
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
        // admin
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
        // customer
        if(startChoice==1){
            String[] customerOptions={"Login","Register","Back"};
            int customerChoice=JOptionPane.showOptionDialog(
              null,
              "Select an option",
              "Customer Menu",
              JOptionPane.DEFAULT_OPTION,
              JOptionPane.INFORMATION_MESSAGE,
                    null,
                    customerOptions,
                    customerOptions[0]
            );
            if(customerChoice==0){
                boolean loggedInCustomer=false;
                while (!loggedInCustomer){//true
                    String customerUserNameInput=JOptionPane.showInputDialog("Customer User Name");
                    if(customerUserNameInput==null) break;
                    String customerPasswordInput= JOptionPane.showInputDialog("Customer Password");
                    if(customerPasswordInput==null) break;

                    boolean customerFound=false;

                    for(int i=0;i<Customer.customerCount;i++){
                        Customer user=Customer.customers[i];
                        if(user.getUsername().equals(customerUserNameInput) && user.getPassword().equals(customerPasswordInput)){
                            customerFound=true;
                            break;
                        }

                    }
                    if(customerFound){
                        JOptionPane.showMessageDialog(null,"Login Success "+customerUserNameInput);
                        loggedInCustomer=true;
                        loggedInCustomerName=customerUserNameInput;
                        CustomerMenu.options();
                        exitProgram=true;
                    }
                    else{
                        String[] incorrectOptions={"Try Again","Back To Start"};
                        int incorrectChoice=JOptionPane.showOptionDialog(
                                null,
                                "Incorrect useraname or password\n Please Try again",
                                "Admin Login",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                incorrectOptions,
                                incorrectOptions[0]
                        );
                        if(incorrectChoice==1||incorrectChoice==JOptionPane.CLOSED_OPTION){
                            break;
                        }
                    }


                }
            }
            else if(customerChoice==1){
                if(Customer.customerCount>=Customer.customers.length){
                    JOptionPane.showMessageDialog(null,"Customer limit reached. Cannot register more.");
                    return;
                }

                String newEmail=JOptionPane.showInputDialog("Enter Email");
                if(newEmail==null && newEmail.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Error : Please Enter a valid Email");
                    return;
                }
                String newCustomer=JOptionPane.showInputDialog("Enter Full Name ");
                if(newCustomer==null && newCustomer.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Error : Please Enter a valid Full Name");
                    return;
                }


                String userName=JOptionPane.showInputDialog("Enter User Name ");
                if(userName==null && userName.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Error : Please Enter a valid user name");
                    return;
                }


                String password=JOptionPane.showInputDialog("Enter Password ");
                if(password==null && password.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Error : Please Enter a valid password");
                    return;
                }

                // check customer exist
                boolean customerExit=false;

                for(int i=0;i<Customer.customerCount;i++){
                    Customer customer=Customer.customers[i];
                    if(customer.getUsername().equals(newCustomer)){
                        customerExit=true;
                        break;
                    }

                }

                if(customerExit){
                    JOptionPane.showMessageDialog(null,"User Name already exists .Please enter choose another");
                }else{
                    // 1
                    Customer.customers[Customer.customerCount]=new Customer(newCustomer,newEmail,userName,password);
                    Customer.customerCount++;
                    JOptionPane.showMessageDialog(null,"Registration success "+newCustomer);
                    System.out.println(Arrays.asList("Register Customers "+Customer.customers));
                    loggedInCustomerName=userName;
                    CustomerMenu.options();
                }



            }
            if(customerChoice==2 || customerChoice==JOptionPane.CLOSED_OPTION){
                JOptionPane.showMessageDialog(null,"Thank you");
            }
        }

    }
}