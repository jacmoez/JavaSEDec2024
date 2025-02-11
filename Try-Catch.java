import java.io.InterruptedIOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

class TryBlock1 {
    public static void main(String[] args) {
        try{ // outer try block
            try {// inner try block
                int a = 28/0; 
            } catch(ArithmeticException e){
                System.out.println(e);
            }
            try {
                int a [] = new int[5];
                a[5] = 50;
            } catch(ArrayIndexOutOfBoundsException e ){
                System.out.println(e);
            }
        } catch(Exception e ){
            System.out.println("handled the exception");
        }
        System.out.println("normal flow...");
    }
}

class TryBlock2 {
    public static void main(String[] args) {
       try{ //outer try block 
        try{ //inner 1 try block
            try{ // inner 2 try block
                int arr [] = {10, 20, 30, 40};
                System.out.println(arr[10]);
            } catch(ArithmeticException e){
                System.out.println("Arithmetic Excption");
                System.out.println("inner try block 2");
            }
        } catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
            System.out.println("inner try block 1");
        }
       }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
       } catch (Exception e){
            System.out.println("Exception ");
       } 
    }
}

class FinallyBlock1 {
    public static void main(String[] args) {
        try {
            int data = 25/5;
            System.out.println(data);
        } catch(NullPointerException e){
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("Nonmal Flow");
    }
}

//Throw 
class Throw1 {
    void validate(int age){
        if(age < 18){
            throw new ArithmeticException("You Young");
        } else {
            System.out.println("You Men");
        }
    }
    public static void main(String[] args) {
        Throw1 t = new Throw1();
        t.validate(17);
        System.out.println("Normal Code!");
    }
}

class Methods {
    static void add() throws InterruptedException  {
     for(int i = 0; i <= 10; i ++){
        System.out.println(i);
        Thread.sleep(1000);
     }
    }
    public static void main(String[] args) throws InterruptedException {
       add();
       System.out.println("Hello");
    }
}

/**
 * DDR5 RAM (Double Data Rate 5 )
 * Spped 4800 MHz to 8400 MHz
 * Power 1.1V  
 * 128 GB 
 * On-Die ECC (Error Correction Code )
 * Dual-Channel per Module 
 */