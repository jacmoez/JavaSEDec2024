
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServices {
    static Scanner sc=new Scanner(System.in);
    public static void viewProducts(){
        for(int i=0;i<Product.products.length;i++){
            Product product=Product.products[i];
            if(product!=null){
                System.out.println("""
                        ID    :   %s
                        Name  :   %s
                        Price :   %s
                        Stock :   %s
                        """.formatted(
                        product.getId(),
                        product.getName(),
                        product.getPrice(),
                        product.getStock()
                ));
                System.out.println("----------------------------------------------");
            }
        }
    }
    public static void addProduct(){
        if(Product.productCount>=Product.products.length){
            System.out.println("Product list is full");
            return;
        }
        System.out.println("Enter Product Name : ");
        String name=sc.nextLine();
        System.out.println();
        System.out.println("Enter Product Price : ");
        double price=Float.parseFloat(sc.nextLine());//
        System.out.println("Enter Product Stock : ");
        int stock=Integer.parseInt(sc.nextLine());
        Product.nextId++;
        Product product=new Product(Product.nextId,name,price,stock);
        Product.products[Product.productCount]=product;
        Product.productCount++;
        System.out.println("Product add with ID : "+product.getId());
    }
    public static void deleteProduct(){
        System.out.println("--------- Delete Product ------------");
        System.out.println("Enter Product ID to delete");
        int idToDelete= Integer.parseInt(sc.nextLine());// id =2
        boolean found=false;
        for(int i=0;i<Product.productCount;i++){ // [1,2,3,4,5] , [1,2,4,5]
            if(Product.products[i]!=null && Product.products[i].getId()==idToDelete) {
                for (int j = i; j < Product.productCount - 1; j++) {//
                    Product.products[j] = Product.products[j + 1];// [2]=[2+1]
                }
                Product.products[Product.productCount-1]=null;
                Product.productCount--;
                System.out.println("Product with ID "+idToDelete+ " deleted .");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Product Not Found");
        }

    }
    public static void purchaseProduct(){
        System.out.println("Here are our available products");
        viewProducts();
        System.out.println("How many different products do you want to buy?");
        int numOfItems=Integer.parseInt(sc.nextLine());
        double total=0.0;
        List<Transaction> pendingTransaction=new ArrayList<>();
        for(int i=0;i<numOfItems;i++){
            System.out.println("Enter Product ID : ");
            int productId=Integer.parseInt(sc.nextLine());
            System.out.println("Enter product quantity : ");
            int quantity =Integer.parseInt(sc.nextLine());
            Product selectProduct=null;
            for(int j=0;j<Product.products.length;j++){ //
                if(Product.products[j]!=null && Product.products[j].getId()==productId){
                    selectProduct=Product.products[j];
                    break;
                }
            }
            if(selectProduct==null){
                System.out.println("Product ID not found");
                continue;
            }

            if(selectProduct.getStock()>=quantity){
                int newStock=selectProduct.getStock()-quantity;
                selectProduct.setStock(newStock);

                double itemTotal=selectProduct.getPrice()*quantity;
                total+=itemTotal;
                System.out.printf("Purchased %d x %s  = $%.2f \n ",quantity,selectProduct.getPrice(),itemTotal);
                pendingTransaction.add(
                        new Transaction(Login.loggedInCustomerName,selectProduct.getName(),quantity,selectProduct.getPrice()));

            }else{
                System.out.println("Not Enough stock for "+selectProduct.getName());
            }
            System.out.println();
        }

        System.out.printf("Total amount : $%.2f\n",total);

        for(Transaction t:pendingTransaction){
            //t=  new Transaction("aa","p1",200,)
            //t=  new Transaction("bb","p2",200,)
            t.save();
        }

    }

}