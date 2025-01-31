import java.util.Scanner;

public class BMI {

    public void showInput(){
        // age
        Scanner sc=new Scanner(System.in); // Read - input
        System.out.println("Enter Your Age :  ");
        int age= sc.nextInt(); // int value
        System.out.println("Enter Gender :  1. Male  2.Female ");
        int gender=sc.nextInt();
        System.out.println("Enter height in ft ");
        int height_ft=sc.nextInt();
        System.out.println("Enter height in inches ");
        int height_in=sc.nextInt();
        System.out.println("Enter weight in pounds ");
        int weight=sc.nextInt();

        String user_info="Age : %d , Gender : %d , Height : %d feet and %d inches , Weight : %d ";
        String user_data=String.format(user_info,age,gender,height_ft,height_in,weight);
        System.out.println(user_data);
        int height_inches=height_ft*12+height_in;
        int height_inches_sq=height_inches*height_inches;
        float bmi = 703*((float) weight /height_inches_sq); //
        System.out.println( weight /height_inches_sq); //
        System.out.println((float) weight /height_inches_sq);
        System.out.println("BMI is "+bmi);
        // <16 =>Thinness
        // Moderate Thinness	16 - 17
        // Mild Thinness	17 - 18.5
        // Normal	18.5 - 25
        // Overweight	25 - 30
        // Obese Class I	30 - 35
        if(bmi<16) System.out.println("Thinness");
        else if(bmi>=16 && bmi<17) System.out.println("Moderate Thinness");
        else if (bmi>=17 && bmi<18.5) System.out.println("Mild Thinness");
        else if (bmi>=18.5 && bmi<25) System.out.println("Normal");
        else if(bmi>=25 && bmi<30) System.out.println("Overweight");
        else if(bmi>=30 && bmi<35) System.out.println("Obese Class I");
        else System.out.println("Obese Class II");
        String [][] calories_list={
                {"Acorn Squash","1/2 Squash","116"} ,// String[]
                {"Apple","1 Medium"	,"65"},
                {"Avocado",	"1 Medium",	"255"}
        };
        System.out.println("Fruit and Vegetables\t\tServing\t\tCalories");
        for(String[] fruit : calories_list){ // foreach, hence for loop
            //fruit = {"Acorn Squash","1/2 Squash","116"}
            System.out.printf("%s\t\t%s\t\t%s%n",fruit[0],fruit[1],fruit[2]);

        }

        System.out.println("--------------------");
        for(int i=0;i<calories_list.length;i++){
            //calories_list[0] = {"Acorn Squash","1/2 Squash","116"}
            String[] fruit=calories_list[i];
            System.out.println(fruit[0]+" , "+fruit[1]+" , "+fruit[2]);
        }

        /*
            Acorn Squash	1/2 Squash	116
            Apple	1 Medium	65
            Apple	1 Large	100
            Apricot	1 Medium	20
            Artichoke	1 Medium	20
            Asparagus	6 Spears	20
            Avocado	1 Medium	255
            Banana	1 Medium	50
            Banana	1 Large	100
            Bell Pepper	1 Medium	30
         */



    }

    public static void main(String[] args) {
        BMI bmi=new BMI();
        bmi.showInput();
    }

}
