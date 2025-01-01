import java.util.Arrays;

class Main{
    public static void main(String [] args){
        System.out.println("Hello Java");
    }
}

//Nested Swicth 

class Swicth5{
    public static void main(String[] args) {
        char branch = 'j';
        int amsSchool = 2;
        switch(amsSchool){
            case 1:
            System.out.println("Core Java,MySQL");
            break;
            case 2:
            switch (branch) {
                case 'J':
                    System.out.println("HTML,CSS, JavaScript, JSP, Spring");
                    break;
                case 'P':
                    System.out.println("HTML, CSS, JavaScript, Django");
                    break;
                case 'j':
                  System.out.println("HTML, CSS, JavaScript, Nodjs, Reactjs, Nextjs");
                  break;
            }
            break;
            case 3:
              switch (branch) {
                case 'J':
                    System.out.println("Java API, AWS, DevOp");
                    break;
                case 'P':
                System.out.println("Python API, AWS, DevOp");
                break;
                case 'j':
                System.out.println("JavaScript API, AWS, Devop");
                
              }
        }

    }
}

// Looping 
// Simple for loop
// For-each or Enhhancedd loop
// Labelled Loop

  class For1{
    public static void main(String[] args) {
      for(int i = 0; i <= 10;i+=5){
        System.out.println(i); 
      }
    }
  }

  //Arrays

  class Array1 {
    public static void main(String[] args) {
        int [] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(Arrays.toString(numbers));
        // System.out.println(numbers.length);
        // for(int i = 0; i < numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }

        int [] num = new int[2];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
  }

  class Array2 {
    public static void main(String[] args) {
        int [] numbers = new int[]{10,20,30,40};
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
  }

  class Array3 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
  }

  class name {
    static public void main(String [] args){
      System.out.println("Hello Java Development!");
      String [] []names = {
        {"Mr.", "Msr.", "Ms." },
        {"Phyoe", "Su"}
      };
      System.out.println(names[0][0] + names[1][0]);
      System.out.println(names[0][2] + names[1][1]);
    }
  }