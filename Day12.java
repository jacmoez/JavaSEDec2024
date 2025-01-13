class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

/***
 * Java Static 
 * 
 * 1, Variable 
 * 2, Method
 * 3, Block
 * 4, Nested Class
 */

 class Student {
    int id;
    String name;

    static String school = "Yangon";

    Student(int i, String n){
        id = i;
        name = n;
    }

    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name +"\nStudent School: " +  school + "\n===================================================");
    }
 }

 class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Maung Maung");
        Student s2 = new Student(202, "Aung Aung");
        Student.school = "Bago";
        s1.studentInfo();
        s2.studentInfo();
    }
 }

 class Counter{
    static int count=0;

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

 //Static Method

 class Student1 {
    int id;
    String name;
    static String school = "Yangon";

    Student1(int i, String n){
        id = i;
        name = n;
    }


    static void change(){
        school = "Mon";
    }
    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name +"\nStudent School: " +  school + "\n===================================================");
    }
 }

 class TestStudnet1 {
    public static void main(String[] args) {
        Student1.change();
        Student1 s1 = new Student1(101,"Maung Maung");
        Student1 s2 = new Student1(202, "Aung Aung");
        s1.studentInfo();
        s2.studentInfo();
    }
 }

 class Calculate {
     int cube(int x){
        return x * x * x;
    }

    public static void main(String[] args) {
        int result = new Calculate().cube(4);
        System.out.println(result);
    }
 }

 //static block

 class A {
    static {
        System.out.println("static block is invoked");
    }
    public static void main(String[] args) {
        System.out.println("Hello A Class!");
    }
 }

 /**
  * Java Nested Class 
    1, Static Nested Class
    2, Non-static Nested class (Inner class)
    3, Local Inner Class
    4, Anonymous Inner Class

  */

  //varabileScrop

  class VarabileScrop1 {
   static int x = 10;
    private int y = 20;

    public void method(int x){
        VarabileScrop1 v = new VarabileScrop1();
        this.x = 30;
        y = 40;

        System.out.println("Local value of x: " + v.x);
        System.out.println("Global value of y: " + v.y);
        System.out.println("Local value of y: " + y);
    }
    public static void main(String[] args) {
        VarabileScrop1 v = new VarabileScrop1();
        v.method(5);
    }
  }