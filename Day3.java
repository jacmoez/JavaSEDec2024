import java.util.Scanner;

public class Day3 {
    
}

/**
 * Data Type in Java 
 * 1, Primitive data type 
 *    boolean, char, byte, short, int, long, float, double.
 * 
 * 2, Non-primitive data type 
 *    Countless eg,.. class, array, inteface, object 
 * 
 * Opertatos in Java 
 *  
 *   Unary Operator
 * 
 *   Arithmetic Operator 
 * 
 *   Shift Operator
 * 
 *   Relational Operator
 *   
 *   Bitwise Operator
 *  
 *   Logical Operator
 * 
 *   Ternary Operator
 *  
 *   Assignment Operator
 */


 class Operator1 {
    public static void main(String [] args){
        System.out.println("Hello Java Operator");
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println((a+b)*c);
    }
 }

 class NestedIf {
    public static void main(String[] args) {
        String city = "Yangon,Myanmar";
      
        if(city.endsWith("Myanmar")){
            if(city == "Mandalay"){
                System.out.println("City is Mandaly");
            } else if (city == "Bago"){
                System.out.println("City is Bago");
            }else if (city == "Yangon"){
                System.out.println("City is Yangon");
            } else if(city.endsWith("Japan")){
                if(city == "Toyko"){
                    System.out.println("City is Toyko");
                } else if(city == "Osakar"){
                    System.out.println("City is Osakar");
                } else if (city == "Nagoyar"){
                    System.out.println("City is Nagoyar");
                } else {
                    System.out.println(city);
                }
            }
        }
    }
 }

 class If1{
    public static void main(String[] args) {
        //defining age varaible
        int age = 30;
        //checking the age 
        if(age > 18){
            System.out.println("Age is greater than 18");
        }
    }
 }

 class If2 {
    public static void main(String[] args) {
        //စုံကိန်း နဲ့ မကိန်း 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int number = scanner.nextInt() ;

        scanner.close();
        if(number %2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
 }

 //ရက်ထပ်နှစ် ၄ နဲ့စား၊ ၁၀၀ နဲ့ စားမပြတ်၊ ၄၀၀ စား။

 class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.close();
        
        if((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)){
            System.out.println("Leap Year");
        } else {
            System.out.println("Common Year");
        }
    }
 }

 class IfElseIf{
    public static void main(String[] args) {
        int marks = 72;
        if(marks < 50){
            System.out.println("Fail");
        } else if(marks >= 50 && marks < 60){
            System.out.println("Grade D");
        } else if (marks >= 60 && marks < 70){
            System.out.println("Grade C");
        } else if (marks >= 70 && marks < 80){
            System.out.println("Grade B");
        } else if(marks >= 80 && marks < 90){
            System.out.println("Grade A");
        } else if (marks >= 90 && marks < 100){
            System.out.println("Grade A+");
        } else {
            System.out.println("invalid!");
        }
    }
 }