import examples.decorator.*;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        Needle needle = new Needle();
        Egg egg = new Egg(needle);
        Duck duck = new Duck(egg);
        Rabbit rabbit = new Rabbit(duck);
        Chest chest = new Chest(rabbit);
        Oak oak = new Oak(chest);
        System.out.println("Power: " + oak.getPower());

         readWithInputStream();
         readWithInputStreamReader();
         writeWithOutputStream("Вот она, вот она -\nНаших душ глубина,");
         writeWithOutputStreamWriter("Вот она, вот она -\nНаших душ глубина,");
    }

    public static void readWithInputStream() throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int chr;
        StringBuilder builder = new StringBuilder();

        while ((chr = bis.read()) != -1) {
            builder.append((char) chr);
        }
        System.out.println(builder.toString());
        bis.close();
    }

    public static void readWithInputStreamReader() throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    public static void writeWithOutputStream(String content) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] contentBytes = content.getBytes();
        bos.write(contentBytes);
        bos.flush();
        bos.close();
    }

    public static void writeWithOutputStreamWriter(String content) throws IOException {
        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(content);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
