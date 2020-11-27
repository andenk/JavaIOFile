import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Scanner;

public class IOFIleMain {
    static ArrayList<String> l = new ArrayList<String>();
    public static void main(String[] args) {

        writeTOFiler();
        readFromFIle();

        lista();
        }

    private static void lista() {
        System.out.print(l);
    }

    private static void readFromFIle() {

        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                l.add(data);
                System.out.print(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeTOFiler(){
        try {
            FileWriter myWriter =  new FileWriter("fileName.txt", true);
            System.lineSeparator();
            myWriter.write("\n");
            myWriter.write("Holla");

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



}




