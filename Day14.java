/***
 * Object 
 * Class
 * Inheritance
 * Polymorphism
 * Abstraction
 * Encapsulation 
 * 
 * Inheritance 
 *  -sub class/Child Class
 *  -Super class/Parent Class 
 */

 class Employee {
    float salary = 3000;
 }

 class Programmer extends Employee {
    int bonus = 5000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer Salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }
 }

 /***
  * 1, Single 
    2, Multilevel
    3, Hierarchical
    4, Multiple 
    5, Hybrid
  */


  class Animal {
    void eat(){
        System.out.println("eating....");
    }
  }

  //Single Inheritance 
  class Dog extends Animal {
    void bark(){
        System.out.println("barking...");
    }
  }

  class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
  }

  //Multilevel Inheritance 
  class Animal1 {
    void eat(){
        System.out.println("eating...");
    }
  }

  class Dog1 extends Animal1{
    void bark(){
        System.out.println("braking...");
    }
  }

  class BabyDog extends Dog1 {
    void sleep(){
        System.out.println("sleeping...");
    }
  }

  class TestAnimal1 {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.sleep();
        d.bark();
        d.eat();
    }
  }

  //3, Hierachical Inheritance 

  class Animal2 {
    void eat(){
        System.out.println("eating...");
    }
  }

  class Dog2 extends Animal2{
    void bark(){
        System.out.println("barking...");
    }
  }

  class Cat extends Animal2 {
    void meow(){
        System.out.println("meowing...");
    }
  }

  class TestAnimal2 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.meow();
        c.eat();
        d.eat();
        d.bark();
        
    }
  }

  //Aggregation 

  class Operation {
   int square(int n){
        return n * n;
    }
  }

  class Circle {
    Operation op;  //Aggreation
    float pi = 3.14f;

    float area(int radius){
        op = new Operation();
        int rsquare = op.square(radius);
        return pi*rsquare;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        float result = c.area(5);
        System.out.println(result);
    }
  }

  class Address {
    String city, state, country;

    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
  }

  class Student{
    int id;
    String name;
    Address address;

    Student(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void studentInfo(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Studnet Address: " + address.city +", " + address.state +", "+ address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Lathar", "Yangon", "Myanmar");
        Address address2 = new Address("Thein Phyu", "Mandalay", "Burma");

        Student s1 = new Student(101, "Maung Maung", address1);
        Student s2 = new Student(202, "Aung Aung", address2);

        s1.studentInfo();
        s2.studentInfo();
    }

  }

class Phone {
    private String iphone;

   String  getPhone(){
        return iphone;
    }

    void setPhone(String iphone){
        this.iphone = iphone;
    }
}

class Testing {
  public static void main(String[] args) {
    Phone p = new Phone();
    p.setPhone("15ProMax");
   System.out.println(p.getPhone());
  }
    
}