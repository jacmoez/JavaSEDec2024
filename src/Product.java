public class Product {
    private  int id;
    private  String name;
    private  double price;
    private int stock;
    static Product[] products=new Product[100];
    static int productCount=3;
    static int nextId=3;
    public Product(int id,String name,double price,int stock){
        this.id=id;
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    static{
        products[0]=new Product(1,"Dell Computer",15.55,10);
        products[1]=new Product(2,"iPhone 17",12.55,5);
        products[2]=new Product(3,"Macbook Air",50.2,7);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public static Product[] getProducts() {
        return products;
    }

    public static int getProductCount() {
        return productCount;
    }

    public static int getNextId() {
        return nextId;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
