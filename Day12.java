/***
 * this keywork 
 * 1, current class instance varaible
 * 2, current class method
 * 3, current class constructor
 * 4, argument method
 * 5, argument constructor 
 * 6. argument instance method
 */

 class Student {
    int id;
    String name;
    float fee;

    Student(int id , String name, float fee){
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudnet Fee: " + fee + "\n==================================");
    }

 }

 class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Maung Maung", 45000);
        Student s2 = new Student(202, "Aung Aung", 2000);

        s1.studentInfo();
        s2.studentInfo();
    }
 }

 //current class method

 class A {
    void m(){
        System.out.println("Hello m");
    }

    void n(){
        this.m();
        System.out.println("Hello n");
    }
 }

 class TestA{
    public static void main(String[] args) {
        A a = new A();
            a.n();
    }
 }

 //current class constructor

 class B {
    int age;
    B(){
        System.out.println("Hello B");
    }
    // B(int x){
    //     age = x;
    //    this();
    //     System.out.println(x);
        
    // }
 }

 class TestB {
    public static void main(String[] args) {
        B b = new B();
       
    }
    }
 
class Student1 {
    int id;
    String name;
    float fee;

    Student1(int i, String n){
        id = i;
        name = n;
    }

    Student1(int id, String name, float fee){
        this(id,name);
        this.fee = fee;
    }

    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudnet Fee: " + fee + "\n==================================");
    }
}

class TestStudent1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Maung Maung");
        Student1 s2 = new Student1(202, "Aung Aung", 1200);

        s1.studentInfo();
        s2.studentInfo();
    }
}

//4  this argument method 

class A1{
    void m(A1 x){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }

    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.m(a1);
    }

}
