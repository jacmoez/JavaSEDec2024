package zinphone;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class FW{
    String file_path="file1.txt";

    public  void fileWrite_1() throws IOException {
        FileWriter fw=new FileWriter(file_path);
        fw.write("From file write method 1\n");
        fw.append("From file write method 1");
        fw.close();
    }

    public  void fileWrite_2() throws IOException{
        BufferedWriter bfw=new BufferedWriter(new FileWriter(file_path));
        bfw.write("From file write method 2");
        bfw.newLine();
        bfw.write("Method2 Second Line");
        bfw.close();
    }

    public  void fileWrite_3() throws IOException{
        PrintWriter pw=new PrintWriter(file_path);
        pw.println("Method3");
        pw.println("this is from file write method 2");
        pw.close();
    }

    public  void fileWrite_4() throws IOException {
        String str="this is from method 4 of file writing";
        Files.write(Paths.get(file_path),str.getBytes());
    }

    public  void fileWrite_5() throws IOException {
        List<String> lines= Arrays.asList("this is  line1","this is line2","this is line 3");
        Files.write(Paths.get(file_path),lines);
    }

    public  void fileWrite_6() throws IOException {
        String str="this is from method 5 of file writing";
        FileOutputStream fos=new FileOutputStream(file_path);
        fos.write(str.getBytes());
        fos.close();
    }

}

class FD{
    String file_path="file1.txt";
    public void  fileDelete_1(){
        File f1=new File(file_path);
        boolean deleted=f1.delete();
        if(deleted) System.out.println("File deleted");
        else System.out.println("File delete fail");
    }
    public void  fileDelete_2() throws IOException {
//        Files.delete(Paths.get(file_path));

        if(Files.deleteIfExists(Paths.get(file_path))){
            System.out.println("File deleted");
        }else System.out.println("File Delete Fail");
    }

}


class  FC{
    String file_path="C:\\Users\\DELL\\AquaProjects\\TeachingJava\\file\\file.txt";
    public  void createAFile_1() throws IOException {
        File file=new File(file_path);
        String created=file.createNewFile()?"Created":"File Creation Fail";
        System.out.println(created);
    }
    public  void createAFile_2() throws IOException {
        Path path=Paths.get(file_path);
//        Files.createDirectories(path);
        Files.createFile(path);
    }


}

class FR{
    String file_path="file1.txt";
    public  void readAFile_1() throws IOException {
        FileReader fr=new FileReader(file_path);
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
    }

    public void readAFile_2() throws IOException {
        BufferedReader bfr=new BufferedReader(new FileReader(file_path));
        String line;
        while((line= bfr.readLine())!=null){
            System.out.println(line);
        }
        bfr.close();
    }

    public  void readAFile_3() throws FileNotFoundException {
        Scanner sc=new Scanner(new File(file_path));
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    public  void readAFile_4() throws IOException {
        byte[] bytes=Files.readAllBytes(Paths.get(file_path));
        System.out.println(new String(bytes));
    }
    public  void readAFile_5() throws IOException {
        List<String> lines=Files.readAllLines(Paths.get(file_path));
        for(String line:lines){
            System.out.println(line);
        }
    }

    public  void readAFile_6() throws IOException {
        FileInputStream fis=new FileInputStream(file_path);
        int byteData;
        while((byteData=fis.read())!=-1){
            System.out.print((char)byteData);
        }
    }



}


public class FileRWTest  {
    public static void main(String[] args) throws IOException, InterruptedException {
//        FW fw=new FW();
//        fw.fileWrite_1();

//        fw.fileWrite_2();
//        System.out.println("File Creation and write");
//        fw.fileWrite_3();
//        fw.fileWrite_4();
//        fw.fileWrite_5();
//        fw.fileWrite_6();

//        FR fr=new FR();
//        fr.readAFile_1();
//        fr.readAFile_2();
//        fr.readAFile_3();
//         fr.readAFile_4();
//        fr.readAFile_5();
//        fr.readAFile_6();
//        FD fd=new FD();
//        fd.fileDelete_1();
//        fd.fileDelete_2();
//        System.out.println("File is already deleted");

          FC fc=new FC();
//          fc.createAFile_1();
        fc.createAFile_2();

    }
}


