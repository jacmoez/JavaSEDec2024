import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class JavaString2 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

//4,Using String.join()

class StringJoin1 {
    public static void main(String[] args) {
        String firstName = "Zin";
        String lastName = "Phon";
        String fulName = String.join(" ","Hello",firstName, lastName );
        System.out.println(fulName);
    }
}

//5, Using the String.format()

class StringFormat1 {
    public static void main(String[] args) {
        String firstName = "Zin";
        String lastName = "Phon";

        String fulName = String.format("Hello %s %s",firstName, lastName);
        System.out.println(fulName);
    }
}

//6, Using Collectors.joining()

class StringCollector1 {
    public static void main(String[] args) {
        List<String> liststr = Arrays.asList("Core Java", "DBMS", "Servelt", "Spring", "Nodejs", "React");
        String str = liststr.stream().collect(Collectors.joining(", "));
        System.out.println(str.toString());
    }
}

//SubString 

class SubString1 {
    public static void main(String[] args) {
        String s = "Zin Phon";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 4: " + s.substring(0,1));
    }
}

class StringMethod1 {
    public static void main(String[] args) {
        String name = "  Zin Phon   ";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        name = name.trim();
        System.out.println(name.startsWith("Zin"));
    }
}

class StringMethod2 {
    public static void main(String[] args) {
        String s  = new String("Zin Phon");
        System.out.println(s.length());
        String s2 = s.intern();
        System.out.println(s2);
    }
}

class StringMethod3 {
    public static void main(String[] args) {
        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s+10);
    }
}


class StringMethod4 {
    public static void main(String[] args) {
        String s1 = "Java Student Zin Phon";
        String replaceString = s1.replace("Zin Phon", "Thiri Maung Maung");
        System.out.println(replaceString);
    }
}


//Java Regex (Regular Expression)

/**
 * Match Result inteface
 * Matcher class
 * Pattern class
 * PatternSyntaxException
 */

 class Regex1 {
    public static void main(String[] args) {
        //One Way 
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //Two way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        //Three Way 
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);
    }
 }

 class Regex2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "mk"));
        System.out.println(Pattern.matches(".s", "mst"));
        System.out.println(Pattern.matches(".s", "ams"));
        System.out.println(Pattern.matches("..s", "ams"));
        System.out.println(Pattern.matches("[ams]", "m"));
        System.out.println(Pattern.matches("[ams]?", "ss"));
        System.out.println(Pattern.matches("[ams]+", "jj"));
    }
 }

