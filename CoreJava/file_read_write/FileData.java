package file_read_write;
import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileData {
    

    public static void writeToFile(String file,boolean append) throws IOException{
        // FileWriter fw=new FileWriter(file);// write
        FileWriter fw=new FileWriter(file,append);
        fw.write("Hello Students can learn multiple courses");// append
        fw.write('a');
  
    }

    public static void readAFile1(String file) throws FileNotFoundException{
        File f=new File(file);
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
    
    public static void readAFile2(String file) throws FileNotFoundException{
        File f=new File(file);
        Scanner sc=new Scanner(f);
        System.out.println(sc.useDelimiter("\\z").next());
        sc.close();
    }

    public static void readAFile3(String file) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line=br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }
        br.close();

    }

    public static void readAFile4(String file) throws IOException{
        List<String> all=Files.readAllLines(Paths.get(file));
        for(String line:all){
            System.out.println(line);
        }
    }
    public static void readAFile5(String file) throws IOException{
        String data=Files.readString(Path.of(file),StandardCharsets.UTF_8);
        System.out.println(data);
    }



    public static void main(String[] args) throws IOException {
        // writeToFile("a.txt",true);
        // readAFile1("a.txt");
        // readAFile2("a.txt");
        // readAFile3("a.txt");
        // readAFile4("a.txt");
        readAFile5("a.txt");
    }
}
