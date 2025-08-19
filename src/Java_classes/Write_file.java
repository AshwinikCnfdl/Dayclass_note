package Java_classes;

import java.io.FileWriter;
import java.io.IOException;

public class Write_file {
    public static void main(String[] args) throws IOException {
        String  path = "C:/Users/hp/IdeaProjects/Java_project_/Test_file.txt" ;

        FileWriter writer = new FileWriter(path,true);
        writer.write(" \n java PL");
        writer.flush();

//        \n next line
//        \t  tab space
    }
}
