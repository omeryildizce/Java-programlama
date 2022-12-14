import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "students.txt";
        createFile(text);
        getFileInfo(text);
        readFile(text);
        writeFile(text);
        readFile(text);

    }
    public static void getFileInfo(String text)
    {
        File file = new File("files/"+text);
        if (file.exists())
        {
            System.out.println("Dosya adı :"+ file.getName());
            System.out.println("Dosya yolu :" + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi? :" + file.canWrite());
            System.out.println("Dosya okunabilir mi? :" + file.canRead());
            System.out.println("Dosya boyutu (byte) :" +  file.length());
        }
    }
    public static void createFile(String text) {
        File file = new File("files/"+text);
        try {
            if (file.createNewFile())
            {
                System.out.println("Dosya oluşturuldu.");
            }
            else {
                System.out.println("Dosya mevcut.");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void readFile(String text)
    {
        File file = new File("files/"+text);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public static void writeFile(String text)
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("files/"+text, true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}