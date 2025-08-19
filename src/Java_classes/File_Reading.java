package Java_classes;
import java.io.*;
public class File_Reading {
    public static void main(String[] args) throws IOException {
        //file handling and exception
//        file :-- read and write the file text file using the java
        String path = "C:/Users/hp/IdeaProjects/Java_project_/Test_file.txt";
//        "C:\\Users\\hp\\IdeaProjects\\Java_project_\\Test_file.txt"

        //read the file
//        1. File  object
        File file = new File(path);
        //then read file reader
        FileReader read_mode = new FileReader(file);
        BufferedReader reader = new BufferedReader(read_mode);
//        System.out.println(reader.lines());
//        System.out.println(reader.readLine());
//        System.out.println(reader.readLine());
//        System.out.println(reader.readLine());
//        System.out.println(reader.readLine());

        String line = reader.readLine();

        while (line != null){
            System.out.println(line);
            line = reader.readLine();
        }






    }

}
