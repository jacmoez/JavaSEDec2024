package file_read_write;
import java.io.File;
import java.io.IOException;

public class FileCreationClass {
    public boolean createAFile(String file) throws IOException{
        File fi=new File(file);
        return fi.createNewFile();
    }
}

class FileCreationTest{

    public static void main(String[] args) {
        FileCreationClass fc=new FileCreationClass();
        try {
            if(fc.createAFile("a.xlsx")){
                System.out.println("File Creation Success");
            }else{
                System.out.println("File Creation Fail");
            }
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Text File Creation Fail "+e.getMessage());
        }

        try {
            fc.createAFile("a.docx");
            // if(fc.createAFile("a.txt")){
            //     System.out.println("File Creation Success");
            // }else{
            //     System.out.println("File Creation Fail");
            // }
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Html File Creation Fail "+e.getMessage());
        }
    }
}
