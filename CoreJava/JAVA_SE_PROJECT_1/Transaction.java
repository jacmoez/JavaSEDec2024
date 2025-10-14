import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String customerName;
    private String productName;
    private  int quantity;
    private  double price;
    private Date transactionDate;
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static Transaction[] transactions=new Transaction[1000];
    public static int transactionCount=0;

    public Transaction(String customerName, String productName, int quantity, double price) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.transactionDate=new Date();
    }

    public void save(){
        if(transactionCount<transactions.length){// 1000->1 => 2
            transactions[transactionCount]=this;// current object
            transactionCount++;
        }
        else {
            System.out.println("Transaction Storage full. Cannot save transaction");
        }
    }

    // admin
    public static void viewAllTransactions(){
        System.out.println("============= ALL TRANSACTIONS ==========");
        if(transactionCount==0){
            System.out.println("No Transaction Record");
            return;
        }
        for(int i=0;i<transactionCount;i++){
            Transaction t=transactions[i];
            System.out.printf("""
                    Customer Name       : %s
                    Product             : %s
                    Quantity            : %s
                    Price($)            : %s
                    Date                : %s
                    """,t.customerName,t.productName,t.quantity,t.price,dateFormat.format(t.transactionDate));
            System.out.println();
        }
    }

    public static void viewCustomerTransactions(String customerName){
        System.out.println("============= YOUR TRANSACTIONS ==========");
        boolean found=false;
        for(int i=0;i<transactionCount;i++) {
            Transaction t = transactions[i];
            if (t.customerName.equals(customerName)) {
                found=true;
                System.out.printf("""
                        Customer Name       : %s
                        Product             : %s
                        Quantity            : %s
                        Price($)            : %s
                        Date                : %s
                        """, t.customerName, t.productName, t.quantity, t.price, dateFormat.format(t.transactionDate));

            }
        }
        if(!found){
            System.out.println("No Transactions found for "+customerName);
        }

    }

    static {
        Product[] products=Product.products;
        //String customerName, String productName, int quantity, double price
        transactions[0]=new Transaction("susu",products[0].getName(),1,products[0].getPrice());
        transactions[0].transactionDate=new Date();
        transactionCount=1;

    }

}

/*

Transaction t=new Transaction();
public class Transaction {
    private String customerName;
    private String productName;
    private  int quantity;
    private  double price;
    private Date transactionDate;
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static Transaction[] transactions=new Transaction[1000];
    public static int transactionCount=0;

    public Transaction(String customerName, String productName, int quantity, double price) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.transactionDate=new Date();
    }

    public void save(){
        if(transactionCount<transactions.length){
            transactions[transactionCount]=this;// current object
            transactionCount++;
        }
        else {
            System.out.println("Transaction Storage full. Cannot save transaction");
        }
    }

    // admin
    public static void viewAllTransactions(){
        System.out.println("============= ALL TRANSACTIONS ==========");
        if(transactionCount==0){
            System.out.println("No Transaction Record");
            return;
        }
        for(int i=0;i<transactionCount;i++){
            Transaction t=transactions[i];
            System.out.printf("""
                    Customer Name       : %s
                    Product             : %s
                    Quantity            : %s
                    Price($)            : %s
                    Date                : %s
                    """,t.customerName,t.productName,t.quantity,t.price,dateFormat.format(t.transactionDate));

        }
    }

    public static void viewCustomerTransactions(String customerName){
        System.out.println("============= YOUR TRANSACTIONS ==========");
        boolean found=false;
        for(int i=0;i<transactionCount;i++) {
            Transaction t = transactions[i];
            if (t.customerName.equals(customerName)) {
                found=true;
                System.out.printf("""
                        Customer Name       : %s
                        Product             : %s
                        Quantity            : %s
                        Price($)            : %s
                        Date                : %s
                        """, t.customerName, t.productName, t.quantity, t.price, dateFormat.format(t.transactionDate));

            }
        }
        if(!found){
            System.out.println("No Transactions found for "+customerName);
        }

    }

    static {
        Product[] products=Product.products;
        //String customerName, String productName, int quantity, double price
        transactions[0]=new Transaction("susu",products[0].getName(),1,products[0].getPrice());
        transactions[0].transactionDate=new Date();



    }

}

 */
