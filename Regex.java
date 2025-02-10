import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex1 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println(Pattern.matches("\\d", "abc"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "123abc"));

        System.out.println(Pattern.matches("\\D", "abc"));
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "abc"));
        System.out.println(Pattern.matches("\\D", "a"));
    }
}

class Regex2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9@]{6}", "zin22@"));
        System.out.println(Pattern.matches("[95]{1}[0-9]{9}", "9553030046"));
    }
}

class Regex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter regex pattern: ");
            Pattern pattern = Pattern.compile(scanner.nextLine());
            System.out.print("Enter text: ");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            boolean found = false;
            while (matcher.find()){
                System.out.println("I found the text " + matcher.group() + " starting at index " + matcher.start() + " and ending at index " + matcher.end());
                found = true;
            }
            if (!found){
                System.out.println("No match found.");
            }
        }
    }
}

/**
 * Exception Handling
 * 1, Checked Exception
 *      ( IOException, SQLException, ParseException, ClassNotFoundException)
 * 2, Unchecked Exception
 *      (NullPointerException, ArrayIndexOutBoundsException, ArithmeticException, IIIegalArgumentException)
 * 3, Error
 *
 * try, catch, finally, throw, throws
 */


class Exception1 {
    public static void main(String[] args) {
        try {
            int data = 100/0;
        } catch (ArithmeticException e){
            System.out.println("Error");
        }

        System.out.println("normal flow");
    }
}

class Exception2 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        try{
            int result = dividend/ divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed ");
        }
    }
}

class Exception3 {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e){
            System.out.println("Error: Null reference ");

        }
    }
}

class Exception4 {
    public static void main(String[] args) {
        String str = "abc";
        try{
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e){
            System.out.println("Error: Unable to parse the String as an integer.");
        }
    }
}

class Exception5 {
    public static void main(String[] args) {
        int [] number = {10,20,30,40};
        try{
            System.out.println(number[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Index is out of bounds.");
        }
    }
}

class Exception6 {
    public static void main(String[] args) {
        try{
            int res = 10 /0;
            System.out.println(res);
        } catch (Exception e){
            System.out.println("Exception " + e);
        }
        System.out.println("I will always execute");
    }
}

//Collection, IO, Thread