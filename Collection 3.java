import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello ArrayList");
    }
}
class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("orange");
        al.add("Banana");
        al.add("grapes");
        System.out.println(al.get(1));
        al.set(1, "Lemo"); 
        System.out.println("=".repeat(33));
        for(String s : al){
            System.out.println(s);
        }

    }
}

//SortArrayList
class ArrayList2{
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        Collections.sort(list1);

        for(String s : list1){
            System.out.println(s);
        }
        System.out.println("=".repeat(33));
        System.out.println("Sorting number");
        List<Integer> list2 = new ArrayList<>();
        list2.add(22);
        list2.add(11);
        list2.add(33);
        list2.add(55);
        list2.add(88);
        Collections.sort(list2);

        for(Integer i : list2){
            System.out.println(i);
        }
    }
}

//iterate 
/**
 * 1. iterator interface
 * 2. for-each loop
 * 3. ListIterator loop
 * 4. for Loop
 * 5, forEach()
 * 6, forEachRamaining()
 */

 class ArrayList3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        Collections.sort(list1);

        ListIterator<String> list2 = list1.listIterator(list1.size());
        while (list2.hasPrevious()) {
            String str = list2.previous();
            System.out.println(str);
        }
        
        System.out.println("=".repeat(33));
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.println("=".repeat(15) + "forEach()" + "=".repeat(15));
        
        list1.forEach(က->System.out.println(က));
        System.out.println("=".repeat(11) + "forEachRemaining()" + "=".repeat(11));
        Iterator<String> itr = list1.iterator();
        itr.forEachRemaining(a->System.out.println(a));
    }
 }