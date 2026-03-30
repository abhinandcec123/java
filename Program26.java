import java.io.*;

class FileWriteRead {
    public static void main(String[] args) {
        try {
            // Writing to file
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello, this is a file handling example.");
            fw.close();

            // Reading from file
            FileReader fr = new FileReader("sample.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
