import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        // Part 1: Copy from source to destination using Byte Streams
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            
            // TODO: Declare an integer variable to hold the byte read
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
            return; // Exit if copy fails
        }

        System.out.println("File Copied");

        // Part 2: Read and display the contents of the newly created destination file
        try (FileInputStream fis = new FileInputStream(destFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error reading destination file: " + e.getMessage());
        }
    }
}
