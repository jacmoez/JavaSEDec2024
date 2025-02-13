package Core;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maung Maung"); // 0
        names.add("Aung Aung");  // 1 
        names.add("Zin Zin"); // 2 
        names.add("Phone Phone"); // 3 
        names.add(2,"Thiri");
        names.add("Zin Zin");
        System.out.println(names.size());
        // System.out.println(names.get(0));
        // System.out.println(names.get(1));
        // System.out.println(names.get(2));
        // System.out.println(names.get(3));
        // System.out.println(names.get(4));
        // for(int i = 0; i < names.size(); i++){
        //     System.out.println(names.get(i));
        // }
        System.out.println("=".repeat(33));
        System.out.println(names.isEmpty());
        //names.clear();
        System.out.println(names.isEmpty());
        names.remove("Aung Aung");
        names.remove(1);

        // for(String name : names){
        //     System.out.println(name);
        // }

        ArrayList<String> studnets = new ArrayList<>();
        studnets.add("ArKar");
        studnets.add("Mya Mya");
        //System.out.println("=".repeat(33));
        studnets.addAll(names);
        System.out.println("=".repeat(15)+ "Names" + "=".repeat(15));
        Main m = new Main();
        m.outPut(names);
        System.out.println("=".repeat(15)+ "Students" + "=".repeat(15));
        m.outPut(studnets);
        System.out.println(studnets.lastIndexOf("Maung Maung"));
        // for(int i = 0; i < studnets.size(); i++){
        //     System.out.println(studnets.get(i));
        // }
        /**
         * clear()
         * isEmpty()
         * remove(int index)
         * size()
         * add()
         * addAll()
         * lastIndexOf()
         */
    }

    void outPut(ArrayList<String> list){
        for(String s : list){
            System.out.println(s);
        }
    }
}

/**Collection Framework 
 * list 
 * set 
 * map 
 * 
 * Iterable 
 * Collection 
 * List ,                       Queue                           Set 
 * 1, ArrayList                Deque                           HashSet
 * 2, LinkdList                 ArrayDeque                      LinkedHashSet
 * 3, Vector,Stack              PriorityQueue                   SortedSet, TreeSet
 * 
 * Reusability 
 *                                               
 * 
*/