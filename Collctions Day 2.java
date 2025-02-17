import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
       List<String> names = new ArrayList<>();
        names.add("Maung Maung");
        names.add("Aung Aung");
        names.add("Tun Tun");
        names.add("Su Su");
        names.add("Hnin Hnin");

        names.remove("Su Su");
        System.out.println(names.size());
        for(String name : names){
            System.out.println(name);
        }
    }
}

class Collection1 {

    void collectionUsage(){
        int [] numberArray = new int[]{1,2,3,4};

        List<Integer> numberList = new ArrayList<>();

        Map<Integer, String> numberMap = new HashMap<>();

        //add elements to ArrayList
        numberList.add(1);
        numberList.add(2);

        //Put Key-value pairs
        numberMap.put(1, "alpha");
        numberMap.put(2, "beta");

        System.out.println("First Element of numberArray: " + numberArray[0]);
        System.out.println("Fist Element of numberList: " + numberList.getFirst());
        System.out.println("First Element of numberMap: " + numberMap.get(1));
        System.out.println("=".repeat(33));

        for(int num : numberArray){
            System.out.println(num);
        }
        System.out.println("=".repeat(33));
        for(Integer num : numberList ){
            System.out.println(num);
        }
        System.out.println("=".repeat(33));

        for(Map.Entry<Integer, String> entry : numberMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
       for(int i = 0; i < numberList.size(); i++){
        System.out.println(numberList.get(i));
       }
    }
    public static void main(String[] args) {
        Collection1 c = new Collection1();
        c.collectionUsage();
    }
}

//List Interface
/**
 * List <data-type> list1 = new ArrayList();
 * List <data-type> list2 = new LinkList();
 * List <data-type> list3 = new Vector();
 * List <data-type> list4 = new Stack();
 */

 //1ArrayList 

 class List1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Maung Maung");
        list.add("Aung Aung");
        list.add("Hnin Hnin");
        list.add("Su Su");
     
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
 }

 //2LinkedList 

 class List2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Maung Maung");
        ll.add("Aung Aung");
        ll.add("Zin Zin");
        ll.add("Phone Phone");
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
                System.out.println(itr.next());
        }
    }
 }

 //3, Vector 

 class List3 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Maung Maung");
        v.add("Aung Aung");
        v.add("Tun Tun");
        v.add("Mya Mya");
        v.add("Zin Zin");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
 }

 //4 Stak 
 class List4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Maung Maung");
        stack.push("Aung Aung");
        stack.push("Hla Hla");
        stack.push("Mya Mya");
        stack.push("Zin Zin");

        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
 }