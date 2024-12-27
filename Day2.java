import java.util.Scanner;

public class Day2 {
    
    // Method 
    // Return Type (Data Type)
     public static void main(String [] args){
        System.out.println("Hello Java");
    }
}


//JVM 
// Control Statement 
/**
 * Decision Making Statemnets
 *   if statements
 *   switch statemnets
 * 
 * Loop Statements
 *   do while loop
 *   while loop
 *   for loop
 *   for-each loop
 * 
 * Jump Statements
 *   break statemnet 
 *   continue statement
 */

 class If1{
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        if(x + y > 10){
            System.out.println("x + y is greater than 20");
        }
    }
 }

 class If2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if(x+y < 10){
            System.out.println(" x + y is less than 10");
        } else {
            System.out.println("x + y is greater than 20");
        }
    }
 }

 class If3{

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you City : ");
        String city = scanner.nextLine();
        scanner.close();

      
        if(city.equals("Yangon")){
            System.out.println("City is Yangon");
        } else if (city.equals("Mandalay")){
            System.out.println("City is Mandalay");
        } else if (city.equals("Japan")){
            System.out.println("City is Japan");
        } else {
            System.out.println(city);
        }
     }
 }

 //Java Programming, hight level, object-oriented programming language 

 //1995 Sun Microsysems (James Gosling )

 //Desktop Appication, Mobile (Andrio),Web Application, Enterpise App
 // Embeeded System, Smard Card, Robotics, Games, ML, AI 

 //C++, int long 


 /**
  * 1.Class File 

    2.Clasloader 

    3.Bytecode Verified (JVM)

    4.Interpreter

    5.Runtime

    6.Hardware (01011100)
  */

  // JRE (Java Runtime Enviroment ), JDK (Java Developer Kit)

  /**
   * Java Variable 
   * 1, Local Variable 
   * 
   * 2, Instance Variable 
   * 
   * 3, Static Variable 
   */

class Varaible {
    String boy = "Ko Zin"; //Instance Variable
    static String boy3 = "Ma Zin"; // Static Variable 
    public static void main(String[] args) {
        // String boy1 = "Ko Zin"; // Local varaible 
        // String boy2 = "Maung Zin"; 
        Varaible v = new Varaible();
         System.out.println("My nmae is 1" + boy3 + ".");
        v.show();
    }

    void show(){
        System.out.println("My name is 2" + boy3);
    }
}
