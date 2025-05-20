// junit
import java.io.Serializable;
import java.util.*;
class Main {

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
          //hashMap.remove(2);//key
          System.out.println("Remove Key 20 => "+hashMap.remove(20));
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

class MapTest{
     public static void main(String[] args) {
          Map<String,Integer>  map=new HashMap<>();// key,value
          map.put("one",1);

          Map<String,Integer> childMap=new HashMap<>();
          childMap.put("eleven",11);
          childMap.put("tewelve",12); //{string:number,string:number}

          map.putAll(childMap);
          System.out.println(map);

          System.out.println(map.keySet());

          System.out.println(map.values());

          System.out.println(map.entrySet());


          map.forEach((k,v)->System.out.println(k+" => "+v));


          Map<Integer,String> m=new HashMap<>();
          m.put(1,"apple" );
          m.put(4, "orange");
          m.compute(4, (k,v)->v+" fruit");
          System.out.println(m); 
          m.put(2,"lemon");
          m.computeIfAbsent(3, k->"Two");
          System.out.println(m); 
          m.merge(3,"Five" ,(o,n)-> o+" - "+n);
          System.out.println(m);

          System.out.println(m.equals(map));
          System.out.println(m +" ->" +m.getClass().getSimpleName());
          System.out.println(m.toString()+" ->" +m.toString().getClass().getSimpleName());


     }
}


class MapEx {
     public static void main(String[] args) { // rock , paper ,soccer game
          StudentManager studentManager=new StudentManager();
          studentManager.addStudent("မောင်မောင်", ၁၀၀);
          studentManager.addStudent("လှလှ", ၈၉);
          studentManager.addStudent("မွန်မွန်", ၉၀);
          System.out.println("======================================");
          System.out.println(" afer add ");
          studentManager.displayAll();
          System.out.println("======================================");
          System.out.println(" afer update ");
          studentManager.updateScore("မွန်မွန်", 99);
          studentManager.displayAll();
          System.out.println("======================================");
          System.out.println(" afer get ");
          studentManager.getScore("မွန်မွန်");
          System.out.println("======================================");
          System.out.println(" afer remove");
          studentManager.removeStudent("လှလှ");
          studentManager.displayAll();
          System.out.println("======================================");



     }
}


class StudentManager {

     private Map<String,Integer> studentScores; // declaration <String,Integer>
     
     public StudentManager(){
          studentScores=new HashMap<>(); // intialize 
     }

     public void addStudent(String name,int score){
          studentScores.put(name, score);
          System.out.println(name+" add with score : "+score);
     }

     public void updateScore(String name,int score){
          if(studentScores.containsKey(name)){
               studentScores.put(name,score);
               System.out.println(name+"'s score update to : "+score);
          }else{
               System.out.println(name+" not found");
          }
     }

     public void getScore(String name){
          Integer score=studentScores.get(name);
          if(score!=null) System.out.println(name+"'s score "+score);
          else System.out.println(name+" not found");
     }

     public void removeStudent(String name){ // abc 10
          if(studentScores.remove(name)!=null){
               System.out.println(name+" removed ");
          }else{
               System.out.println("Not found");
          }
     }

     public void displayAll(){
          if(studentScores.isEmpty()) System.out.println("No student found");
          else {
               System.out.println("All Students and scores are ");
               studentScores.forEach((name,score)-> System.out.println(name +" => "+score));
          }
     }
     
}
