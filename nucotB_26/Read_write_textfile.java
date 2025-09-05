package nucotB_26;

import java.io.*;

public class Read_write_textfile {
    public static void main(String[] args) throws IOException {

        String file_loc = "C:/Users/hp/IdeaProjects/Java_project_/data1.txt";
        //file write mode
        FileWriter file = new FileWriter(file_loc,true);
        BufferedWriter writer = new BufferedWriter(file);
        writer.write("hello i am python \n hello i am from java");
        writer.flush();

//        String file_loc = "C:/Users/hp/IdeaProjects/Java_project_/data.txt";
//        //file read mode
//        FileReader file = new FileReader(file_loc);
//        //file read
//        BufferedReader reader = new BufferedReader(file);
//       //loop
//       // for(int sp = 0; ?)
//        //while or for
//        String line = reader.readLine();
//        while(line != null){
//            System.out.println(line);
//            line = reader.readLine();
//        }






        //file write mode

    }
}
