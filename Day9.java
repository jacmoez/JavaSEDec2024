public class Day9 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

/***
 * Object Oriented Programming OOP 
 * - State
 * - Behavior
 * - Identity 
 * 
 * Class Member 
 *   - Filed
 *   - Methods
 *   - Constructors
 *   - Blocks
 *   - Nested Class and Interface (Enu)
 */

class MyClass {

    int myFiled;

     MyClass(int value){
        myFiled = value;
    }
    public static void main(String[] args) {
        MyClass my = new MyClass(10);
        System.out.println("Value of my Filed: " + my.myFiled);
    }
}

class Student{
    int id;  
    String name; 
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Student ID: " + s1.id + "\nStudnet Name: " + s1.name + "\n================================");
        System.out.println("Student2 ID: " + s2.id + "\nStudnet2  Name: " + s2.name + "\n================================");
    }
}

/**
 * By reference variable
 * By method 
 * By Constructor
 */

 //Reference Varaible
class Student2{
    int id;
    String name;
    public static void main(String[] args) {
       Student2 s1 = new Student2();
       Student2 s2 = new Student2();
        s1.id = 101;
        s1.name = "Maung Maung";

        s2.id = 202;
        s2.name = "Aung Aung";

        System.out.println("Student ID: " + s1.id + "\nStudnet Name: " + s1.name + "\n================================");

        System.out.println("Student ID: " + s2.id + "\nStudnet Name: " + s2.name + "\n================================");
    }
}



class Student3 {
    int id;
    String name;
}


class TestStudent3 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();      //Stack Memory
        Student3 s2 = new Student3();
        s1.id = 101;                      //Heap Memory
        s1.name = "Maung Maung";
        s2.id  = 202;
        s2.name = "Aung Aung";
        System.out.println("Student ID: " + s1.id + "\nStudnet Name: " + s1.name + "\n================================");
        System.out.println("Student ID: " + s2.id + "\nStudnet Name: " + s2.name + "\n================================");
    }
}

//2, Method

class Student4 {
    int id;
    String name;

    void ထည်သည်(int i, String n){
        id = i;
        name = n;
    }
    void ပြသည်(){
        System.out.println("Student ID: " + id + "\nStudnet Name: " + name + "\n================================");
    }
}

class TestStudnet4 {
    public static void main(String[] args) {
        Student4 s1 = new Student4();
        Student4 s2 = new Student4();

        s1.ထည်သည်(101, "Maung Maung");
        s2.ထည်သည်(202, "Aung Aung");
        s1.ပြသည်();
        s2.ပြသည်();
    }
}

class Employee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s){
        id = i;
        name = n;
        salary = s;
    }
    void show(){
        System.out.println("Employee ID: " + id + "\nEmployee Name: " + name + "\nEmployee Salary: " + salary + "\n================================");
    }
}


class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.insert(101, "Maung Maung", 90000);
        e2.insert(202, "Aung Aung", 130000);
        e1.show();
        e2.show();
    }
}

//3. Constructor

class Student5 {
    int id;
    String name;

    public Student5(int i, String n){
        id = i;
        name = n;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStudnet Name: " + name + "\n================================");
    }
}

class TestStudent5 {
    public static void main(String[] args) {
        Student5 s1 = new Student5(101, "Maung Maung");
        Student5 s2 = new Student5(202, "Aung Aung");
        s1.show();
        s2.show();
    }
}
