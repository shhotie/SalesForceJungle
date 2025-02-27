package exchandling;

import encapsulation.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            findfile();
        }catch (IOException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void findfile() throws FileNotFoundException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}
