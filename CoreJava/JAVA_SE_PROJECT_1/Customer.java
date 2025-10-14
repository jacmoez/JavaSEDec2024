public class Customer {
    //
    private int id;
    private String name, username,email,password;

    public Customer(String name, String username, String email,String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password=password;
    }

    public static Customer[] customers=new Customer[100];
    public static int customerCount=0;
    static{
        customers[0]=new Customer("Maung Maung","maungmaung","maung@gmail.com","1");
        customerCount=1;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static void viewCustomers(){
        if(customerCount==0){
            System.out.println("Noo customers registered yet .");
            return;
        }
        else{
            System.out.println("--------- Register Customer --------");
            for(int i=0;i<customerCount;i++){
                Customer c=customers[i];
                if(c!=null){
                    System.out.println((i+1)+" . Name  : "+c.getName());
                    System.out.println("    Email : "+c.getEmail());
                    System.out.println("    User Name : "+c.getUsername());
                }
            }
        }
    }
}
