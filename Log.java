import java.io.File;
import java.io.FileWriter;

class Log{
    static void print(String arg){
        System.out.println(arg);
    } 
    static void write_to_file(String arg){  
        File Written = new File("filename.txt");
        Written.createNewFile("filename.txt");
        FileWriter myWriter = new FileWriter("filename.txt", true);
        myWriter.write(arg);
        myWriter.close();
    }
}

