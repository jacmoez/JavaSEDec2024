package zinphone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        TryCatchExample eg=new TryCatchExample();
//        eg.method1();
//        eg.method2();
//        eg.method3();
        eg.method4();
    }

    public void method1(){
        /*
        try,catch
         */
         try{
             String str="Hello";// 5 -> 0-4
             System.out.println(str.charAt(5));
         }catch (StringIndexOutOfBoundsException e){
             //System.out.println(e.getMessage());
             System.out.println("Error :  "+e);
         }
//        String str="Hello";// 5 -> 0-4
//        System.out.println(str.charAt(5));
        System.out.println("After Try Catch");
    }

    public void method2(){
        Scanner sc=new Scanner(System.in);
        sc.close();
        try {
            sc.nextInt();
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
//            System.out.println(e.fillInStackTrace());
        }
    }

    public void method3(){
        try {
            int num1 = 10;
            int num2 = 2;
            System.out.println(num1 / num2);

            int[] ary = {1, 2, 3, 4, 5};
            System.out.println(ary[6]);
        }catch (ArithmeticException e){
            System.out.println("Error 1");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error 2");
        }
    }

    // try-with-resources
    public void method4() {
        try(FileReader fr=new FileReader("aa.txt");BufferedReader br=new BufferedReader(fr)) {
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e) {
//
            System.out.println(e.getMessage());
        }
    }
}
/*
    Collections
    Files
    Try-catch
    Threads
 */

class ThreadExample{
    public static void main(String[] args) {
     ThreadExample e=new ThreadExample();
//     e.method1();
    }

    void method1(){
        Runnable task=()->{
            for(int i=0;i<5;i++){
                System.out.println("I Value is "+i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1=new Thread(task,"Thread1");
        Thread t2=new Thread(task,"Thead2");
        t1.start();
        t2.start();
    }

}

class Counter{
    private  int count=0;
    public synchronized void increment(){
        count++;
        System.out.println("Count ->  "+count);
    }
}

class  CounterMain{
    public static void main(String[] args) {
        Counter c=new Counter();
        Thread t1=new Thread(c::increment);
        Thread t2=new Thread(c::increment);
        t1.start();
        t2.start();
    }
}

class ThreadExample2 extends Thread{// run

    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        ThreadExample2 th2=new ThreadExample2();
        th2.start();
    }
    public  void run(){
        System.out.println("Running thread");
    }
}

class RunnableExample{

}

