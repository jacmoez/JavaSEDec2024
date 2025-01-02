import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

//For Loop

class Loop1 {
    public static void main(String[] args) {
        
        int sum = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Looping index " + i);
            sum += i;
       
        }
        System.out.println("Sum Value = " + sum);
    }
    
}

class A {
    public static void main(String[] args) {
        // int a = 10;
        // a += 1;
        // System.out.println(a);
        int sum = 10;
        int i = 1;
        sum += i;
        System.out.println(sum);
    }
}

class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer: ");
        num = scanner.nextInt();
        scanner.close();

        System.out.println("Multiplication Table of " + num);

        for(int i = 1; i <= 12; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}

class Loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num; // ကိန်းဂဏန်းသိမ်းများ 
        int fact = 1;

        System.out.print("Enter any positive integer: ");
        num = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= num; i++ ){
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}

class Loop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1;
        System.out.print("Enter the base number: ");
        base = scanner.nextInt(); //2

        System.out.print("Enter the power: ");
        power = scanner.nextInt(); //2
        scanner.close();

        for(int i = 1; i <= power; i++){ //2
            result *= base; //2
        }
        System.out.println("Result: " + result);
    }
}

// 3 4 5 6 7 8 
// 2 3 4 5 6 7 8 9 10
class Loop5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();

        System.out.print(" Enter end number: ");
        int end = scanner.nextInt();
        scanner.close();

        for(int i = start; i <= end; i++ ){
            System.out.print(i + " ");
        }
    }
}

class Loop6 {
    public static void main(String[] args) {
        String [] names = {"Java", "C", "C++", "C#", "JavaScript", "Golang"};

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("====================For Each ==========================");

        for(String s : names){
            System.out.println(s);
        }
    }
}

//Java While Loop

class Loop7 {
    public static void main(String[] args) {
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i+=2;
        }
    }
}

//do-while loop
class Loop8 {
    public static void main(String[] args) {
        int i = 10;
        do{
            System.out.println(i);
            i++;
        }while(i < 10);
    }
}