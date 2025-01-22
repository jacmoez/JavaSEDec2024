class Student2 {
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    void studentInfo(){
        System.out.println("Student ID: " + getId() + "\nStudent Name: " + getName() + "\n"+"=".repeat(55));
    }
}

class TestStudent2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.setId(101);
        s1.setName("Maung Maung");
        s1.studentInfo();
    }
}

class Shap {
    protected  float base;
    protected  float height;

    Shap(float base, float height){
        this.base = base;
        this.height = height;
    }
   void showArea(){
        System.out.println(base * height);
    }
}

class Rectangle extends Shap {
    Rectangle(float base, float height){
        super(base,height);
    }
    @Override
    void showArea(){
        System.out.println("Show Area");
    }
}

class Test {

    void showArea(){
        System.out.println("Hello ShowArea");
    }
    public static void main(String[] args) {
        var r = new Rectangle(3,4);
        r.showArea();
        var r1 = new Test();
        r1.showArea();
    }
}