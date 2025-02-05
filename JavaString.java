import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

class String1 {
    public static void main(String[] args) {
        String str = "Hello"; 
        str = str.concat(" Java Student");
        System.out.println(str);
    }
}

class String2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "Javas";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}

class String3 {
    public static void main(String[] args) {
        String s1 = "Maung Maung";
        String s2 = "maung maung";

        boolean equalResult = s1.equals(s2);
        System.out.println("Using equals() method: " + equalResult);

        boolean equalIgnoreResult = s1.equalsIgnoreCase(s2);

        System.out.println("Using equalsIgnoreCase() method: " + equalIgnoreResult);
    }

}

class StringComape1 {
    public static void main(String[] args) {
        String s1 = "Maung Maung";
        String s2 = "Maung Maung";
        String s3 = new String("Maung Maung");// Object Create 
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}

class Test {
    public static void main(String[] args) {
        String num1 = "10";
        String num2 = "10";
        System.out.println(num1 == num2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        String num3 = scanner.nextLine();
        System.out.print("Enter Second Number: ");
        String num4 = scanner.nextLine();
        scanner.close();
        System.out.println(num3.equals(num4));
    }
}

class StringComparsion1 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        String str3 = "JaqA";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
    }
}

class StringCompare1 {
    public static void main(String[] args) {
        String str = "String Compare";
        System.out.println(str.startsWith("String"));
        System.out.println(str.endsWith("Compare"));
    }
}

class  Address {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter City: ");

        String address = scanner.nextLine();
        scanner.close();


        if(address.endsWith("Myanmar")){
            if (address.startsWith("Yangon,")) {
                    System.out.println("Yangon Man");
            } else if (address.startsWith("Mandalay")) {
                System.out.println("Mandalay Man");
            } else if (address.startsWith("Bago")) {
                System.out.println("Bago Man");
            } else {
                System.out.println("Other Men");
            }
        }
    }
}

/***
 * String Concation 
 * 1, Using + 
 * 2, Using String.concat()
 * 3, Using StringBulider (or) StringBuffer class
 * 4, Using String.join()
 * 5, Using String.format()
 * 6, Using Collector.joing()
 */

 //1, using + 
 class StringConcation1 {
    public static void main(String[] args) {
        String s = " Hello" + " Java";
        System.out.println(s);

    }
 }

 class StringConcation2 {
    public static void main(String[] args) {
        String s = 50 + 30 + " Java " + 40 + 40;
        System.out.println(s);
    }
 }

 //2, Using String.concat()

 class StringConcation3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = " student";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
 }

 //3, StringBulider (or) StringBuffer Class

 class StringConcation4 {
    public static void main(String[] args) {
        String fistName = "Zin";
        String lastName = "Phon";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ");
        stringBuilder.append(fistName);
        stringBuilder.append(" ");
        stringBuilder.append(lastName);
        String result = stringBuilder.toString();
        System.out.println(result);
    }
 }