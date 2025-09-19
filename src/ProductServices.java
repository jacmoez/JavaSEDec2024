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
        System.out.println("Product add with ID : "+product.getId());
    }

}
