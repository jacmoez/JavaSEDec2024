// Array

import java.util.Arrays;

class Array1 {
    public static void main(String[] args) {
        String name = "Maung Maung, 10 ";
        System.out.println("My name is " + name.split(",")[1]);
        float [] numbers = new float[3];// index 0, count 1
        numbers[0] = 10;
        numbers[1] = 20.24f;
        numbers[2] = 30;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbers));
        System.out.println("====================");

        String name1 [] = new String[3];
        
        name1[0] = "Maung Maung";
        name1[1] = "Aung Aung";
        name1[2] = "20";

        System.out.println(name1[0]);
        System.out.println(name1[1]);
        System.out.println(name1[2]);
        System.out.println(Arrays.toString(name1));
    }
}

class Array2 {
    public static void main(String[] args) {
        int arr [] = new int[]{10, 20, 30, 40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(Arrays.toString(arr));
    }
}

class Array3 {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40};
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

class Array4 {
    public static void main(String[] args) {
        int arr [][] = {
        {10,20,30},
        {40,50,60},
        {70,80,90}
};

    System.out.print(Arrays.toString(arr[0]));
    System.out.print(Arrays.toString(arr[1]));
    System.out.println(Arrays.toString(arr[2]));
    // for(int i = 0; i < arr.length; i++){
    //     for(int j = 0; j < arr[i].length; j++){
    //         System.out.println(arr[i][j]);
    //     }
    }
    // System.out.println(arr[0][0]);
    // System.out.println(arr[0][1]);
    // System.out.println(arr[0][2]);
    // System.out.println(arr[1][1]);
    // System.out.println(arr[2][2]);
  }


  class Array6 {
    public static void main(String[] args) {
        String names [] [] = {
            {"Mr.", "Mrs. ", "Ms. "},
            {"ko ko", "Su Su", "Kyaw Su"}
        };
        System.out.println("My name is " + names[0][0] + names[1][0]);
        System.out.println("My name is " + names[0][2]+ names[1][1]);
        System.out.println("My name is " + names[0][1] + names[1][2]);
    }
  }

  class Array7 {
    void main(){
        int [] [] arr = {
            {1, 2},
            {3, 4}
        };

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
              System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
  }

  class Array8{
    void main(){
        //Row and Columns in Array
        int a = 2;
        int b = 2;

        int [][]arr = new int[a][b];//looping 4 time
        int itr = 1;

        //value insert
        for(int i = 0; i < a;i++){
            for(int j = 0; j < b; j++){
                arr[i][j] = itr; 
                itr++; //2 , 3, 4
            }
        }

        for(int i =0; i< a; i++){
            for (int j = 0; j < b; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //print
        // for(int i = 0; i < a; i++){
        //     for(int j = 0; j < b; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
  }

  /**
   * 1 2 
   * 3 4
   */
 /**
  * 1 2 3 
    2 4 6
    3 6 9
  */