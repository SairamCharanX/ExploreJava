package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionRunner {
    public static void main(String[] args) {
        try{
            File file = new File("//");
            FileReader fileReader = new FileReader(file);
        }
        catch(FileNotFoundException fileNotFoundException){
            System.out.println("Caught FileNotFoundException");
            System.out.println(fileNotFoundException.getMessage());
        }
    }
}
