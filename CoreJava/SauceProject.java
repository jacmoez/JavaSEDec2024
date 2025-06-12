import java.util.*;
public class Main {
    static Map<String,List<Object>> products=new LinkedHashMap<>();
    static Map<String,List<Object>> cart=new LinkedHashMap<>();
    public static void main(String[] args) throws InterruptedException {
        //login
        LinkedHashMap<String,List<String>> loginUsers=new LinkedHashMap<>();
        loginUsers.put("USER1",List.of("",""));
        loginUsers.put("USER2",List.of("user",""));
        loginUsers.put("USER3",List.of("","password"));
        loginUsers.put("USER4",List.of("standard_user","psw"));
        loginUsers.put("USER5",List.of("u","secret_sauce"));
        loginUsers.put("USER6",List.of("user","123"));
        loginUsers.put("USER7",List.of("standard_user","secret_sauce"));
        for(String key:loginUsers.keySet()){
            List<String> user=loginUsers.get(key);
            login(key,user.get(0),user.get(1));
            Thread.sleep(1000);
        }
    }
    public static void login(String user,String username, String password) {
        System.out.print(user+ "=>");
        if (username == null || username.equals(""))
            System.out.println("Username is required");
        else if(password==null || password .equals(""))
            System.out.println("Password is required");
        else if(username.equals("standard_user")&&password.equals("secret_sauce")) {
            System.out.println("Login Success");
            showProducts();
        }
        else System.out.println("UserName  or Password  does not match");
          /*
             username="" and password=""
           * username ="" , password ="p"
           * username="u",password=""
           * username ="true" and password="wrong"
           * username ="wrong" and password="true"
           * username ="wrong" and password="wrong"
           * username ="true" a
           nd password="true"
           *
           */
    }

    static void showProducts(){
        products.put("Sauce Labs Backpack",List.of(29.99,"carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."));
        products.put("Sauce Labs Bike Light",List.of(9.99,"A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included."));
        products.put("Sauce Labs Bolt T-Shirt",List.of(15.99,"Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt."));
        products.put("Sauce Labs Fleece Jacket",List.of(49.99,"It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office."));
        products.put("Sauce Labs Onesie",List.of(7.99,"Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."));
        products.put("Test.allTheThings() T-Shirt (Red)",List.of(15.99,"This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton."));

        for(Map.Entry<String, List<Object>> product:products.entrySet()){
            System.out.println(product.getKey());//Sauce Labs Backpack
            System.out.println(product.getValue().get(1)); // desc
            System.out.println(product.getValue().get(0)); //price
            System.out.println("-----------------------------------".repeat(3));
        }
        showProductMenu();
    }

    static  void showProductMenu(){
        System.out.println("Choose option -----");
        System.out.println("1.Add Product \n2.Remove Product \n3.View Cart\n");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice){
            case 1:{
                //System.out.println("Add Product");
                addProduct();
                break;
            }
            case 2:{
                System.out.println("Remove Product");break;
            }
            case 3:{
                System.out.println("View Product");break;
            }
            default:{
                System.out.println("Invalid Choice");break;
            }
        }
        sc.close();
    }

    static void addProduct(){
        System.out.println("Choose Product ");
        int num=1;

        List<String> productNames=new ArrayList<>();

        for(String key:products.keySet()){
            System.out.println(num+" . "+key);
            productNames.add(key);
            num++;
        }
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        System.out.println(productNames.get(choice-1));
        System.out.println("Enter Count");
        int count=sc.nextInt();
        System.out.println("Count : "+count);
    }



}
