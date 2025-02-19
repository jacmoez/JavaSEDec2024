import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

class arrayList1 {
    public static void main(String[] args) {
        ArrayList<String> letter = new ArrayList<>();
        letter.add("A");
        letter.add("B");
        letter.add("C");
        letter.add("D");
        System.out.println(letter);
        //letter.removeRange(1,3);
    
        ArrayList<String> letter1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println(letter1); // Output: [A, B, C, D]
        
        // Remove elements at index 1 and 2 (i.e., "B" and "C")
        letter1.subList(1, 3).clear();
        System.out.println(letter1); // Output: [A, D]
    }

    }


class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>  al = new LinkedList<>();
        al.add("Maung Maung");
        al.add("Aung Aung");
        al.add("Zin Zin");
        al.add("Phone Phone");

        LinkedList<String> al2 = new LinkedList<>();
        al2.add("Ma Thiri"); 
        al2.add("Ma Yadanar");
        al.addAll(al2);

        System.out.println(al);

        LinkedList<String> al3 = new LinkedList<>();
        al3.add("Koko Saw");
        al3.add("koko Sai");
        al.addAll(4,al3);
        al.removeFirst();
        al.removeLast();
        System.out.println("=".repeat(33));
        for(String s : al){
            System.out.println(s);
        }
    }
    }

    class Book {
        int id;
        String name, author, publisher;
        int quantity, price;

        public Book(int id, String name, String author, String publisher, int quantity, int price){
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
            this.price = price;
        }
        void show(){
            String reulst = String.format(" Book ID: %d \n Book Name: %s \n Book Author: %s \n Book Publisher: %s \n Book Quantity: %d \n Book Price: %d\n" , id, name, author, publisher, quantity, price);
            System.out.println(reulst + "=".repeat(33));
        }
    }

    class TestBook1 {
        public static void main(String[] args) {
            Book b1 = new Book(101, "Java Basic","Zin Zin", "AMS LTD", 200, 2000);
            Book b2 = new Book(202, "Java Spring", "Phone Phone", "Japn Store", 250, 2500);
            b1.show();
            b2.show();
        }
    }

    class TestBook2 {
        public static void main(String[] args) {
            LinkedList<Book> ll = new LinkedList<>();
            Book b1 = new Book(101, "Java Basic","Zin Zin", "AMS LTD", 200, 2000);
            Book b2 = new Book(202, "Java Spring", "Phone Phone", "Japn Store", 250, 2500);
            Book b3 = new Book(303, "Learning Japanese", "Zin Phone", "Ma Thira Store", 2000, 5500);
            ll.add(b1);
            ll.add(b2);
            ll.add(b3);

            for(Book b : ll){
                String reulst = String.format(" Book ID: %d \n Book Name: %s \n Book Author: %s \n Book Publisher: %s \n Book Quantity: %d \n Book Price: %d\n" , b.id, b.name, b.author, b.publisher, b.quantity, b.price);
                System.out.println(reulst + "=".repeat(33));
            }
        }
    }

    class TestAL{
        public static void main(String[] args) {
           List<String> al = new ArrayList<>();
           al.add("Maung Maung");
           al.add("Aung Aung");
           al.add("Zin Zin");
           al.add("Phone Phone");

           List<String> al2 = new LinkedList<>();
           al2.add("Maung Maung");
           al2.add("Aung Aung");
           al2.add("Zin Zin");
           al2.add("Phone Phone");

           System.out.println(al);
           System.out.println(al2);
        }
    }

