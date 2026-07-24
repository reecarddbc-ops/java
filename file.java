import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        try {
            // Write data to source file
            FileWriter fw = new FileWriter("source.txt");
            fw.write("Hello Java\n");
            fw.write("This is File Handling.");
            fw.close();

            // Copy data from source.txt to destination.txt
            FileReader fr = new FileReader("source.txt");
            FileWriter fw2 = new FileWriter("destination.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw2.write(ch);
            }

            fr.close();
            fw2.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
