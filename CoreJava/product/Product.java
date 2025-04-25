package product;
/*
 * 1.create product txt file /
 * 2.Read file
 * 3.Store to list
 * 4.display
 * 5.choose item
 * 6.choose count
 * 7.check available
 * 8.true => add item
 * 9.false => message
 * 10.show buy item 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProductSold {
    static List<Product> products = new ArrayList<>();
    static List<Product> cart = new ArrayList<>();

    static void addProductToList() throws FileNotFoundException, IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new FileReader("product.txt"));
        String line;
        br.readLine();// for skip title
        while ((line = br.readLine()) != null) {
            // System.out.println(line);
            String[] ary = line.split(",");// 0-3
            // [Computer,1000,100,0]
            String name = ary[0];
            int price = Integer.parseInt(ary[1]);
            int count = Integer.parseInt(ary[2]);
            int discount = Integer.parseInt(ary[3]);
            Product p = new Product(name, price, count, discount);
            products.add(p);
            // System.out.println(products);
            // Thread.sleep(3000);
        }
        br.close();
    }

    static void showProducts(List<Product> products,boolean cart) {
        System.out.println("--------------------------------------------------------------");
        String product = "Name \t\t\t Price \t\t Count \t\t Discount\n";
        product += "--------------------------------------------------------------\n";
        int total=0;
        for (int i = 0; i < products.size(); i++) {
            product += i + 1;
            product += ". " + products.get(i).getName();
            product += " \t\t " + products.get(i).getPrice();
            product += " \t\t " + products.get(i).getCount();
            product += " \t\t " + products.get(i).getDiscount();
            product += "\n";
            if(cart) total+=products.get(i).getPrice()*products.get(i).getCount();
        }
        System.out.println(product);
        if(cart){
            System.out.println("--------------------------------------------------------------");
            System.out.println("Total Cost :  ------------- "+total);
        }
        System.out.println("--------------------------------------------------------------");
    }

    static void chooseItem() throws IOException, Exception {
        boolean con = true;
        Scanner sc = new Scanner(System.in);
        while (con) {
            showProducts(products,false);
            System.out.println("Choose Item : ");
            int item = sc.nextInt();
            while(item>products.size() || item<1){
                System.out.println("Invalid item ");
                System.out.println("Choose Item Again: ");
                item = sc.nextInt();
            }
            System.out.println("Enter count : ");
            int count = sc.nextInt();
            if (count > products.get(item - 1).getCount()) {
                System.out.println("Item count only available : " + products.get(item - 1).getCount());
            } else {
                System.out.println("Add to cart");
                String name = products.get(item - 1).getName();
                int add_count=0;
                int ind=-1;
                for(int i=0;i<cart.size();i++){
                    if(name==cart.get(i).getName()) {
                        add_count=cart.get(i).getCount()+count;// add count if item already exist
                        ind=i; //assign coz we need index to update count of product in cart list
                        break ;
                    }
                }
                
                if(add_count>0){// update count 
                    cart.get(ind).setCount(add_count); // update count of product in cart list
                }
                else{ // add new product
                int price = products.get(item - 1).getPrice();
                int discount = products.get(item - 1).getDiscount();
                cart.add(new Product(name, price, count, discount));
                int new_count=products.get(item - 1).getCount()-count;
                products.get(item - 1).setCount(new_count);
                }
            }
            System.out.println("Do you want shop more item ? 1:Yes, 0:No");
            int yes_no=sc.nextInt();
            while(!(yes_no==1 || yes_no==0)){
                System.out.println("Invalid Choice ");
                System.out.println("Choose  Again: ");
                yes_no = sc.nextInt();
            }
            if(yes_no==0) {
                con=false;
                System.out.println(cart);
                showProducts(cart,true);
                System.out.println("------------- before --------------");
                updateProduct();
            }
            
            
        }

        sc.close();

    }


    public static void updateProduct() throws Exception, IOException{
        BufferedReader br = new BufferedReader(new FileReader("product.txt"));
        String line;
        br.readLine();// for skip title
        String data="name,price,count,discount\n";
        List<Product> list=new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] ary = line.split(",");
            String name = ary[0];
            int price = Integer.parseInt(ary[1]);
            int count = Integer.parseInt(ary[2]);
            int discount = Integer.parseInt(ary[3]);
            boolean con=true;
            String d="";
            // System.out.println(cart+"''"+cart.size()+cart.get(0).getName()+name);
            for(int i=0;i<cart.size();i++){
                if(cart.get(i).getName().equals(name)){
                    d=name+","+price+","+(count-cart.get(i).getCount())+","+discount+"\n";
                    con=false;
                    // System.out.println(count+"-----"+cart.get(i).getCount());
                    break;
                }
            }  
            // System.out.println("2 ----  line");
            // data+=line+"\n";
            if(con) d=line+"\n";
            System.out.println("lIne    : "+d);
            data+=d;
            
        }
        br.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter("product.txt"));
        bw.write("");
        bw.write(data);
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        addProductToList();
        // showProducts();
        chooseItem();
    }
}

class Product {
    private String name;
    private int price, count, discount;

    public Product(String name, int price, int count, int discount) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.discount = discount;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public int getDiscount() {
        return discount;
    }

}