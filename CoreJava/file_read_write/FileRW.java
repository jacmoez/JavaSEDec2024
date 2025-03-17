package file_read_write;
import java.io.File;
import java.io.IOException;

public class FileRW{
    //database
    // url  => 
    // uri 
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/user/Desktop/file.txt");
        boolean file_created=file.createNewFile();// boolean
        if(file_created){
            System.out.println("File Creation Success");
        }
        else{
            System.out.println("File Creation Fail");
        }




        // getInfo1();
        // getInfo2();
    }

    public static void showInfo(int num,String data) throws Exception{
            System.out.println(3/num);
            if(data==null) throw new Exception();
    }

    public static void getInfo1(){
        try {
            showInfo(0,"hello");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Erro from Info1 "+e.getMessage());
        }
    }

    public static void getInfo2(){
        try {
            showInfo(3,null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Info 2 error "+e.getMessage());
        }
    }
}