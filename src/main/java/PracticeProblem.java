import java.io.*;

public class PracticeProblem {

    public static String readFile(String filename) {
        FileReader inputStream = null;
        StringBuilder content = new StringBuilder();

        try {
            inputStream = new FileReader(filename);
            int c;

            while ((c = inputStream.read()) != -1) {
                content.append((char) c);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        return content.toString();
    }

    public static String backwardsReadFile(String filename) {
        String fileData = readFile(filename); 
        StringBuilder reversed = new StringBuilder(fileData);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String filename = "file.txt";

        String normal = readFile(filename);
        System.out.println("Normal:\n" + normal);

        String backwards = backwardsReadFile(filename);
        System.out.println("\nBackwards:\n" + backwards);
    }
}
