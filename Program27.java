import java.io.*;

class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("source.txt");
            FileOutputStream fout = new FileOutputStream("destination.txt");

            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
