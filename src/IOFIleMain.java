import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Scanner;

public class IOFIleMain {
    static ArrayList<String> l = new ArrayList<String>();
    static String info="SistaRaden";
    public static void main(String[] args) {

        readAndFil(); // läser från filen till en arraylist
        writeTOFiler(info); // skriver INFO till sista raden på filen
        //readFromFIle(); //läs från filen och sriver ut svaret

        lista(); // lista hela arrayen
        }

    private static void lista() {
        l.forEach((n) -> System.out.println(n));
    }

    private static void readAndFil(){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                l.add(data);

                }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    private static void readFromFIle() {

        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
               // l.add(data);

                // System.out.print(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeTOFiler(String info){
        try {
            FileWriter myWriter =  new FileWriter("fileName.txt", true);

            myWriter.write("\n");
            myWriter.write(info);
            l.add(info);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



}




