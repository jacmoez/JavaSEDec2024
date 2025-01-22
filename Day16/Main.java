public class Main {
    public static void main(String [] args){
        System.out.println("Hello Java Developer!");
    }
}


abstract class Student {
    abstract void studInfo();
    void address(){

    }
}

class TestStudent extends Student{

    @Override
    void studInfo(){

    }
}

class Teacher extends Student {
          void studInfo(){

        }
}