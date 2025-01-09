class Main {

    
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int a = 10;
        int b = 20;
        Main m = new Main();
        System.out.println(m.add(a, b));
    }

    int add(int a, int b){
            return a + b;
    }
}

/***
 * Constructors
 * 
 * 1, same class name
 * 2, no return type
 * 3, cannot abstract, static, final and synchronized
 * 
 * Type of Java Constructors
 * 
 * 1, Default Constructors (no-arg)
 * 
 * 2, Parameterized Constructor
 */


 // Default Constructors (no-arg)
 class Phone{

    Phone(){
        System.out.println("My Phone: iphone ");
    }
    public static void main(String[] args) {
        new Phone();
    }
 }

 class Student {
    int id;
    String name;

    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\n====================================");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.studentInfo();
        s2.studentInfo();
    }
 }

 //Parameterized Constructor

 class Student2 {
    int id;
    String name;

    Student2(int i, String n){
        id = i;
        name = n;
    }
    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\n====================================");
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "Maung Maung");
        Student2 s2 = new Student2(202, "Aung Aung");
        s1.studentInfo();
        s2.studentInfo();
    }
 }

 //Constructor Overloading
 class Student3 {
    int id;
    String name;
    int age;
    Student3(int i, String n){
        id = i;
        name = n;
    }

    Student3(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudent Age:" + age + "\n====================================");
    }



    public static void main(String[] args) {
        Student3 s1 = new Student3(101, "Maung Maung");
        Student3 s2 = new Student3(202, "Aung Aung", 25);

        s1.studentInfo();
        s2.studentInfo();
    }
 }

 class Phone1 {
    String brand;
    String model;
    int storage;

    Phone1(String b, String m, int s){
        brand = b;
        model = m;
        storage = s;
    }

    void phoneInfo(){
        System.out.println("Phone Brand: " + brand + "\nPhone Model: " + model + "\nPhone Stirage: " + storage + "\n============================================");
    }

    public static void main(String[] args) {
        Phone1 p1 = new Phone1("iphone", "iphone 15 Pro Max", 256);
        Phone1 p2 = new Phone1("Mi", "Note 14 pro", 512);
        p1.phoneInfo(); 
        p2.phoneInfo();
    }
 }

 //Copy Constructor

 class Student4 {
    int id;
    String name;

    Student4(int i, String n){
        id = i;
        name = n;
    }

    Student4(Student4 s4){
        id = s4.id;
        name = s4.name;
    }

    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\n====================================");
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4(101,"Maung Maung");
        Student4 s2 = new Student4(s1);
        s1.studentInfo();
        s2.studentInfo();
    }
 }

 //Copying values without constructor

 class Student5 {
    int id;
    String name;

    Student5(int i, String n){
        id = i;
        name = n;
    }

    Student5(){}
    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\n====================================");
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(101, "Maung Maung");
        Student5 s2 = new Student5(202, "Aung Aung");
        Student5 s3 = new Student5();

         s3.id = s1.id;
         s3.name = s1.name;
       
        s1.studentInfo();
        s2.studentInfo();
        s3.studentInfo();
    }
 }

 //Java Static Keyword

/***
 * variable
 * Method 
 * Block
 * Nested class 
 */

 class Student6 {
    int id;
    String name;
    static String school = "B.E.H.S.(1) Yangon";

    Student6(int i, String n){
        id = i;
        name = n;
    }

    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudent School: " + school +"\n====================================");
    }

    public static void main(String[] args) {
        Student6 s1 = new Student6(101, "Maung Maung");
        Student6 s2 = new Student6(202, "Aung Aung");
        Student6.school = "B.E.H.S (1) Manadaly";

        s1.studentInfo();
        s2.studentInfo();

    }
 }


 class Counter {
    static int count = 0;

    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
      
        Counter c2 = new Counter();
     
        Counter c3 = new Counter();
       
    }
 }