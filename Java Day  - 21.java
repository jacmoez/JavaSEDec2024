import org.openqa.selenium.json.JsonOutput;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java Developer!");
    }
}

//Super parent instance variable, parent class method, parent class constructor

class Animal {
    String color = "white";
}

class Dog extends Animal {
        String color = "black";
        void printColor(){
            System.out.println(color);
            System.out.println(super.color);
        }
}

class TestSuper {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.printColor();
        Animal a = new Animal();
        System.out.println(a.color);

    }
}

class Animal1 {
    void eat(){
        System.out.println("eating...");
    }
}

class Dog1 extends Animal1{
    void eat(){
        System.out.println("eating dog...");
    }

    void bark(){
        System.out.println("barking...");
    }

    void work(){
        super.eat();
        bark();
    }
}

class TestSuper2 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.work();
    }
}

class Animal2 {
    Animal2(){
        super();
        System.out.println("Animal is Create");
    }
}

class Dog2 extends Animal2 {
    Dog2(){
        System.out.println("dog is created");
    }

}

class TestSuper3 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
    }
}

class Person {
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Student extends Person {
    float fees;
    Student(int id, String name, float fees){
        super(id, name);
        this.fees = fees;
    }
    void studentInfo(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudent Fees: " + fees + "\n" + "=".repeat(33));
    }
}

class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Maung Maung", 12000);
        s1.studentInfo();

        Student s2 = new Student(202, "Aung Aung", 145000);
        s2.studentInfo();
    }
}

//instance block

class Car{
    int speed;
    int sp;
    Car(){
        int sp = 0;
        System.out.println("speed is:" + speed);
        sp = 10;
    }

    {speed=100;}


    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
    }
}

/**
 * Final Keyword
 * 1, variable
 * 2, method
 * 3, class
 */


class Calculation {
    int add(int a, int b){
        return a + b;
    }

    float add(float a, float b){
        return a + b;
    }
}

class TestCal {
    public static void main(String[] args) {
        Calculation cal = new Calculation();

        System.out.println("Sum of integers: " + cal.add(5,3));
        System.out.println(cal.add(2.5f,3.4f));
    }
}

class Bank {
    float getRateOfInterest(){
        return 0;
    }
}

class Kbz extends Bank {
    float getRateOfInterest(){
        return 8.4f;
    }
}

class Aya extends Bank {
    float getRateOfInterest(){
        return 8.5f;
    }
}

class  Yoma extends Bank {
    float getRateOfInterest(){
        return 6.4f;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new Kbz();
        System.out.println("KBZ Bank Rate of Interest: " + b.getRateOfInterest());
        b = new Aya();
        System.out.println("AYA Bank Rate of Interest: " + b.getRateOfInterest());
        b = new Yoma();
        System.out.println("Yoma Bank Rate of Interest: " + b.getRateOfInterest());
    }
}