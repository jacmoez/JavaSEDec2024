class User {
    int age;
    String name;
}

class TestUser {
    public static void main(String[] args) {
        User u = new User();
        u.age = -10;
        System.out.println(u.age);
    }
}

class A {
   private int data = 10;
   private void msg(){
    System.out.println("Hello Java");
   }
   public static void main(String[] args) {
    A a = new A();
    a.msg();
   }
}

class TestA {
    public static void main(String[] args) {
        A obj = new A();
        //obj.msg();
    }
}

class B {
    private B(){
        System.out.println("This B Constructor");
    }

    public static void main(String[] args) {
        B obj = new B();

    }
}

class TestB {
    public static void main(String[] args) {
        //B b = new B();
    }
}

//Encapsulation 

class Student {
    //private data member
   private String name;

   public String getName(){
     return name;
   }

   public void setName(String name){
    this.name = name;
   }

}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Maung Maung"); 
        System.out.println(s1.getName());
    }
}

class Account {
    private long accNo;
    private String name, eamil;
    private float amount;

    public long getAccNo(){
        return accNo;
    }

    public void setAccNo(long accNo){
        this.accNo = accNo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return eamil;
    }

    public void setEmail(String email){
        this.eamil = email;
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }
}

class TestAccount{
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setAccNo(1389238);
        acc1.setName("Maung Maung");
        acc1.setEmail("maung@21.com");
        acc1.setAmount(1250.65f);

        System.out.println("Account Number: " + acc1.getAccNo() + "\nAccount Name: " + acc1.getName() + "\nAccount Email: " + acc1.getEmail() + "\nAccount Amount: " + acc1.getAmount());
    } 
}