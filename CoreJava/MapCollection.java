// junit
import java.io.Serializable;
import java.util.*;
public class Main {

     public static void main(String[] args) {
          // key => Integer, value => String 
          HashMap<Integer,String> hashMap=new HashMap<>();
          hashMap.put(1, "One");//key , value
          System.out.println("Map 1 "+hashMap);
          hashMap.put(1, "OneTwo"); // update
          System.out.println("Map 2 "+hashMap);
          hashMap.put(2, "Two");
          System.out.println("Map 3"+hashMap);
          hashMap.putIfAbsent(2, "Number Two");
          System.out.println("Map 4"+hashMap);
          System.out.println("-----------------");
          System.out.println(hashMap.get(1));
          System.out.println(hashMap.get(2));
          System.out.println("-----------------");
          System.out.println(hashMap.get(3));
          System.out.println(hashMap.getOrDefault(2, "Unknown Number"));
          System.out.println("-----------------");
          System.out.println(hashMap.containsKey(2));
          System.out.println(hashMap.containsKey(3));
          System.out.println(hashMap.containsValue("OneTwo"));
          System.out.println(hashMap.containsValue("One"));
          System.out.println("-----------------");
          //{name:"ABC"}
          hashMap.put(3,"Three");
          hashMap.put(4,"Four");
          hashMap.put(5,"Five");
          System.out.println(hashMap);
          System.out.println("-----------------");
          hashMap.remove(2);//key
          System.out.println(hashMap);
          hashMap.put(6,"Five");
          System.out.println(hashMap);
          hashMap.remove(6,"Five"); // key , value
          System.out.println(hashMap);
          System.out.println("---------------------");
          hashMap.replace(1, "One");// 1 => One
          System.out.println(hashMap);
          hashMap.replace(1,"One","Value One");
          // One => Value One
          System.out.println(hashMap);
          hashMap.replaceAll((key,value)->"User_"+value);
          System.out.println(hashMap);

          hashMap.clear();
          System.out.println(hashMap);
          System.out.println(hashMap.isEmpty());
          
          /*
           * public class HashMap<K,V> extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable 
           */
          
     }
}
