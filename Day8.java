import java.util.Scanner;

import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i+= 5){
            System.out.println("*");
        }
    }
}

class Pattern1 {
    public static void main(String[] args) {
        int rows = 6;
       for(int i = 0; i  < rows; i++){
        for(int j = 0; j < i; j ++ ){
            System.out.print("* "); // 0*, 1**,2*** , 3 ****, 
        }
         System.out.println(); // New Line
       }
    }
}

class Pattern2 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = rows; i>= 1; --i){ 
            for(int j = 1; j <= i;  ++j){
                System.out.print(i+ " "+ j);
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

class Test{
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(i--);
        System.out.println(--i);
    }
}

class Switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String name = scanner.nextLine();
        scanner.close();

        switch(name){
            case "A":
            System.out.println("ပထမ စာလုံးဖြစ်သည်၊");
            break;
            case "B":
            System.out.println("ဒုတိယ စာလုံးဖြစ်သည်၊");
            break;
            case "C":
            System.out.println("တတိယ စာလုံးဖြစ်သည်၊");
            break;
            case "Apple":
            System.out.println("Apple = ပန်းသီး၊");
            break;
            case "Orange":
            System.out.println("Orange = လိမ္မော်သီး၊");
            break;
            default:
             System.out.println("အဘိဓာန် စာအုပ်ထဲတွင် မပါပါ၊");
        }
    }
}

class Test1{
    public static void main(String[] args) {
        System.out.println("Hello Java");
        JOptionPane.showMessageDialog(null, "Hello Java", "AMS LTD", 1);
        System.out.println("မဂ်လာပါ ကြိုဆိုပါ၏။");
        JOptionPane.showMessageDialog(null, "မဂ်လာပါ ကြိုဆိုပါ၏။", "AMS LTD", 1);

        
    }
}

class Add{
    public static void main(String[] args) {
        String title = "AMS LTD";
  
        JOptionPane.showMessageDialog(null, "ကိန်းဂဏန်း နှစ်လုံးပေါင်းတဲ့ Program ", title, 1);

        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
        int num2 = Integer.parseInt( JOptionPane.showInputDialog("Enter Second Number: "));

        // int num1 = Integer.parseInt(strNum1);
        // int num2 = Integer.parseInt(strNum2);
        
    
        int sum = num1 + num2;
       
        JOptionPane.showConfirmDialog(null, num1 + " + " + num2 + " = " + sum, title, 1);
      
    }
}