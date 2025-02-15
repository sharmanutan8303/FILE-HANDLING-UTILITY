package Package;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Filedemo {

    // create a file 
    public static void createFile() {
        try{
            File myobj = new File("FileCreate.txt");
            if (myobj.createNewFile()){
                System.out.println("File Created: "+ myobj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // write in a file

    public static void writeFile(){

        try{
            FileWriter mywriter = new FileWriter("FileCreate.txt");
            mywriter.write("File Handling in Java, Write a message in file.");
            mywriter.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Read a file
    public static void readFile() {
        try {
            File myobj = new File("FileCreate.txt");
            Scanner myreader = new Scanner(myobj);
            while(myreader.hasNextLine()){
                String data = myreader.nextLine();
                System.out.println(data);
            }
            
            myreader.close();
        }   catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Modify a file
        public static void modifyFile() {
            try{
                FileWriter myWriter = new FileWriter("FileCreate.txt", true);
                myWriter.write(" This is Java Programming .");
                myWriter.close();
                System.out.println("Successfully updated file.");
            }
            catch(IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    public static void main(String[] args){
        //create a file
        createFile();

        //write a file
        writeFile();

        //Read from the file
        System.out.println("Reading from the file:");
        readFile();

        //modify file
        modifyFile();
        System.out.println("Reading from the file after updation.");
        readFile();
    }
}
